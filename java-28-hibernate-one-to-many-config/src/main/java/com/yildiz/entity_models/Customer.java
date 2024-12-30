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
    // mappedBy == isimlendirme yapılacak olan işlem kimler tarafından yapılıyor anlamak için
    // fetch.lzy == ise yapılacak olan işin hepsini birden getirme ben istedikçe getir
    // cascade == ana tabloyu silersen diğer tabloda silinsin birlikte bağımlı oluyorlar yapılan işlem diğerinde de gerçekleşiyor
    //
    @OneToOne(mappedBy = "customer",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL

    )
    CustomerDetail customerDetail;


    @OneToMany(mappedBy = "customer" , fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    private Set<Order> orders = new HashSet<>();

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
