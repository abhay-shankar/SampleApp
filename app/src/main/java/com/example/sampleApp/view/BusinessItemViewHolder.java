package com.example.sampleApp.view;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sampleApp.R;
import com.example.sampleApp.databinding.BusinessItemBinding;
import com.example.sampleApp.model.Business;
import com.squareup.picasso.Picasso;

public class BusinessItemViewHolder extends RecyclerView.ViewHolder {

    BusinessItemBinding binding;

    public BusinessItemViewHolder(@NonNull BusinessItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void init(Business businessItem) {
        binding.setBusiness(businessItem);
        Picasso.get().load(businessItem.getImageUrl()).resizeDimen(R.dimen.image_dimen,R.dimen.image_dimen).centerCrop().into(binding.businessImage);
    }
}
