package com.example.sampleApp.repo;

import android.util.Log;

import androidx.lifecycle.LiveData;
import com.example.sampleApp.model.Business;
import com.example.sampleApp.model.YelpResponse;
import com.example.sampleApp.repo.service.BaseService;
import com.example.sampleApp.repo.service.YelpService;

import java.util.List;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Singleton
public class Repository {
    private static final String TAG = Repository.class.getName();
    private static Repository repo;
    private static BusinessDAO dao;

    private LiveData<List<Business>> businessLiveData;

    public static Repository getInstance() {
        if (repo == null) {
            dao = BusinessDatabase.getInstance().getBusinessDAO();
            repo = new Repository();
        }
        return repo;
    }

    private Repository() {
        businessLiveData = dao.getAll();
    }

    public LiveData<List<Business>> getBusinessListLiveData() {
        YelpService service = BaseService.getService().create(YelpService.class);
        Call<YelpResponse> responseCall = service.getYelpResponse("410 townsend street, san francisco, CA");
        responseCall.enqueue(new Callback<YelpResponse>() {
            @Override
            public void onResponse(Call<YelpResponse> call, Response<YelpResponse> response) {
                if (response.body()!=null && response.body().getBusinessList()!=null) {
                    //liveData.setValue(response.body().getBusinessList());
                    BusinessDatabase.service.execute(() -> {
                        dao.insertAll(response.body().getBusinessList());
                    });
                }
            }

            @Override
            public void onFailure(Call<YelpResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: ", t);
                //businessLiveData.setValue(null);
            }
        });
        return businessLiveData;
    }
}
