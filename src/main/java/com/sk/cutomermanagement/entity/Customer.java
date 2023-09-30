package com.sk.cutomermanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cus_id", length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "cus_name", length = 255)
    private String userName;

    @Column(name = "cus_email", length = 255)
    private String email;

    @Column(name = "cus_password", length = 255)
    private String password;
}
