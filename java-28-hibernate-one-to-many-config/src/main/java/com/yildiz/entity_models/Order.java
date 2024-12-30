package com.yildiz.entity_models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter


@Entity
@Table(name = "ORDERS")
public class Order {

    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private int oerderId;

    @Column(name = "PRODUCT", length = 50)
    private String product;
    @Column(name = "CODE", length = 50)
    private String code;
    @Column(name = "AMOUNT", precision = 7, scale = 2)
    private BigDecimal amount;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREAT_DATE", length = 50)
    private Date createDate;
}
