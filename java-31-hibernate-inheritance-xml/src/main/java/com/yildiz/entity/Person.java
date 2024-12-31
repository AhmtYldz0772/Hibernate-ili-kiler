package com.yildiz.entity;

public class Person {

    private Long personId;
    private String name;
    private String surname;
    private String address;

    public Person() {
    }

    public Person(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }

    public Person(String surname, String name, String address) {
        this.surname = surname;
        this.name = name;
        this.address = address;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
