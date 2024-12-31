package com.yildiz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "OWNER")

//@DiscriminatorValue("OWNERS")
public class Owner extends Person {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    */
    @Transient // bu alanı es geçecek
    private Long ownerId;
    @Column(name = "TITLE")
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
