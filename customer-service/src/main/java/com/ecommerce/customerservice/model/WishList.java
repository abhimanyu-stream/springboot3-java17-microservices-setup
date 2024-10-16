package com.ecommerce.customerservice.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.util.UUID;

public class WishList {


    private Long id;
    private UUID wishListId;
    @OneToOne
    @JoinColumn()
    private Customer customer;
    @ManyToOne
    @JoinColumn
    private Product product;
}
