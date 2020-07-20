package com.example.itsmesk.revaevent;

import com.google.firebase.database.Exclude;

public class Events {
    private String name;
    private String imageURL;
    private String key;
    private String description;
    private String datetime;
    private String incharge;
    private String phone;
    private String category;
    private String link;
    private int position;

    public Events() {
        //empty constructor needed
    }
    public Events (int position){
        this.position = position;
    }
    public Events(String name, String imageUrl ,String Des, String dateTime, String incharge, String phone, String link, String category) {
        if (name.trim().equals("")) {
            name = "No Name";
        }
        this.name = name;
        this.imageURL = imageUrl;
        this.description = Des;
        this.datetime = dateTime;
        this.incharge = incharge;
        this.phone = phone;
        this.link = link;
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImageUrl() {
        return imageURL;
    }
    public void setImageUrl(String imageUrl) {
        this.imageURL = imageUrl;
    }
    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getIncharge() {
        return incharge;
    }

    public void setIncharge(String incharge) {
        this.incharge = incharge;
    }

    public String getPhone() {
        return phone;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Exclude
    public String getKey() {
        return key;
    }
    @Exclude
    public void setKey(String key) {
        this.key = key;
    }
}

