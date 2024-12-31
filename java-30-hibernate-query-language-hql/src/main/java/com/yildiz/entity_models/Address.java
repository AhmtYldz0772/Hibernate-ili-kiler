package com.yildiz.entity_models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADDRESSES")
public class Address {
    // M - M
    @ManyToMany(mappedBy = "addresses")
    Set<Customer> customers = new HashSet<>();


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_İD")
    private int Address_id;

    @Column(name = "COUNTRY", length = 50, nullable = false)
    private String country;
    @Column(name = "STREET", length = 75)
    private String street;
    @Column(name = "CTIY", length = 50)
    private String city;
    @Column(name = "STATE", length = 200)
    private String state;
    @Column(name = "ZIP", length = 50)
    private String zip;


}
