package com.ecommerce.customerservice.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    @OneToOne
    @JoinColumn
    private Address address;
}
