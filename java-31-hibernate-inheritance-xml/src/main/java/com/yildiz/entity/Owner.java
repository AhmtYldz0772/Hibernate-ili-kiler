package com.yildiz.entity;

public class Owner extends Person {
    private Long ownerId;
    private String title;



    public Owner() {
    }

    public Owner(String surname, String name, String address, String title) {
        super(surname, name, address);
        this.title = title;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String ownerName) {
        this.title = ownerName;
    }




}
