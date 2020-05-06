package com.example.sampleApp.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sampleApp.databinding.BusinessItemBinding;
import com.example.sampleApp.model.Business;

import java.util.ArrayList;
import java.util.List;

public class BusinessAdapter extends RecyclerView.Adapter<BusinessItemViewHolder> {

    private List<Business> businessList;

    public BusinessAdapter() {
        this.businessList = new ArrayList<>();
    }

    @NonNull
    @Override
    public BusinessItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new BusinessItemViewHolder(BusinessItemBinding.inflate(layoutInflater));
    }

    @Override
    public void onBindViewHolder(@NonNull BusinessItemViewHolder holder, int position) {
        holder.init(businessList.get(position));
    }

    @Override
    public int getItemCount() {
        return businessList.size();
    }

    public void setItems(List<Business> businessList) {
        this.businessList.clear();
        if (businessList==null || businessList.size()==0) return;
        this.businessList.addAll(businessList);
        notifyDataSetChanged();
    }
}
