package com.example.sampleApp.repo;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.sampleApp.model.Business;

import java.util.List;

@Dao
public interface BusinessDAO {

    @Query("SELECT * FROM business")
    LiveData<List<Business>> getAll();

    @Insert
    void insertAll(List<Business> businesses);
}
