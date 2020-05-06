package com.example.sampleApp.repo;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.sampleApp.App;
import com.example.sampleApp.model.Business;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Business.class}, version = 1, exportSchema = false)
public abstract class BusinessDatabase extends RoomDatabase {
    public abstract BusinessDAO getBusinessDAO();

    private static volatile BusinessDatabase INSTANCE;

    public static final ExecutorService service = Executors.newFixedThreadPool(4);

    static BusinessDatabase getInstance() {
        if (INSTANCE == null) {
            synchronized (BusinessDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(App.getContext(), BusinessDatabase.class, "BusinessDatabase").build();
                }
            }
        }
        return INSTANCE;
    }
}
