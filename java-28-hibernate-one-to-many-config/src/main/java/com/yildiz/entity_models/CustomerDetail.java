package com.yildiz.entity_models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMERS_DETAILS")

public class CustomerDetail {
    @OneToOne
    @JoinColumn
    Customer customer;
    private String addres;
    private String phone;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "foreign", strategy = "foreign",
            parameters = {
            @org.hibernate.annotations.Parameter(name = "property", value = "customer")
            }
    )
    @Column(name = "CUSTOMER_İD")
    private int customer_id;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREAT")
    private Date createDate;
}
