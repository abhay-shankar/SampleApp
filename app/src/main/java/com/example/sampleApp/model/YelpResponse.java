package com.example.sampleApp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class YelpResponse {

    @SerializedName("total")
    @Expose
    int total;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setBusinessList(List<Business> businessList) {
        this.businessList = businessList;
    }

    @SerializedName("businesses")
    @Expose
    List<Business> businessList;

    public int getTotal() {
        return total;
    }

    public List<Business> getBusinessList() {
        return businessList;
    }


}
