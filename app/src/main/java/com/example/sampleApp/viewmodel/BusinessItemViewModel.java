package com.example.sampleApp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.sampleApp.model.Business;
import com.example.sampleApp.repo.Repository;

import java.util.List;

public class BusinessItemViewModel extends ViewModel {

    private Repository repo;

    public BusinessItemViewModel() {
        this.repo = Repository.getInstance();
    }

    public LiveData<List<Business>> getCoffee() {
        return repo.getBusinessListLiveData();
    }
}
