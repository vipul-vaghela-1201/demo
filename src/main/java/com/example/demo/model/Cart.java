package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "cart_id")
    private String cartId;
    @Column(name = "pname")
    private String pname;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;
}
