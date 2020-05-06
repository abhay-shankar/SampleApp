package com.example.sampleApp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sampleApp.R;
import com.example.sampleApp.viewmodel.BusinessItemViewModel;

public class MainActivity extends AppCompatActivity {

    private BusinessItemViewModel viewModel;
    private RecyclerView recyclerView;
    private BusinessAdapter businessAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(BusinessItemViewModel.class);
        recyclerView = findViewById(R.id.main_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        businessAdapter = new BusinessAdapter();
        recyclerView.setAdapter(businessAdapter);
        viewModel.getCoffee().observe(this, businessList -> {
            businessAdapter.setItems(businessList);
        });
    }
}
