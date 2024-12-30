package com.yildiz.entity_models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

// entity ile model arasında fark entity anatasyonu verildi ise o tablosu veritabanında mutkala oluşur
// modelde ise yapmak zorunda değilsin

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    // M - M
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
            @JoinTable(name = "CUSTOMERS_ADDRESSES",
                    joinColumns = {
                       @JoinColumn(name = "CUSTOMER_İD", nullable = false)
                    },
                    inverseJoinColumns = {
                            @JoinColumn(name = "ADDRESS_İD", nullable = false)
                    }
            )
    Set<Address> addresses = new HashSet<>();

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "CUSTOMER_İD")
     private int customer_id;
    @Column(name = "FIRST_NAME")
     private String firstName ;
    @Column(name = "LAST_NAME")
     private String lastName ;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREAT")
    private Date createDate;



}
