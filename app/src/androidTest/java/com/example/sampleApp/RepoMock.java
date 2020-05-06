package com.example.sampleApp;

import androidx.lifecycle.MutableLiveData;

import com.example.sampleApp.model.Business;
import com.example.sampleApp.repo.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RepoMock {

    private static String NAME = "Yoyo";
    private static Double RATING = 4.0;

    public static void serviceMock() {
        Repository repo = mock(Repository.class);
        MutableLiveData<List<Business>> liveDataMock = mock(MutableLiveData.class);
        liveDataMock.setValue(mockBusinessData());
        when(repo.getBusinessListLiveData()).thenReturn(liveDataMock);
        when(liveDataMock.getValue()).thenReturn(mockBusinessData());
    }

    private static List<Business> mockBusinessData() {
        List<Business> mock = new ArrayList<>(10);
        for (int i=0; i<10; i++) {
            Business temp = new Business();
            temp.setName(NAME);
            temp.setRating(RATING);
            mock.add(temp);
        }
        return mock;
    }
}
