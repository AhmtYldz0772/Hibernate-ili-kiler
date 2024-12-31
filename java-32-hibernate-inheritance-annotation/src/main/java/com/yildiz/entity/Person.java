package com.yildiz.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "PERSONS")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.STRING)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERSONEL_ID")
    private Long personId;
    @Column(name = "PERSONEL_NAME")
    private String name;
    @Column(name = "PERSONEL_SURNAME")
    private String surname;
    @Column(name = "PERSONEL_ADDRESS")
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
