package com.example.sampleApp.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity
public class Business {

    @ColumnInfo(name = "rating")
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("phone")
    @Expose
    private String phone;

    @PrimaryKey
    @SerializedName("id")
    @Expose
    @NonNull
    private String id;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("is_closed")
    @Expose
    private Boolean isClosed;
    @SerializedName("review_count")
    @Expose
    private Integer reviewCount;

    @ColumnInfo(name = "name")
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    @ColumnInfo(name = "image_url")
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("transactions")
    @Expose
    @Ignore
    private List<String> transactions = null;

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
}
