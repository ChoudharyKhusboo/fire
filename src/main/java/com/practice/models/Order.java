package com.practice.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_id")
    private int orderId;

    @Column(name="total_price")
    private double price;

    @Column(name="user_id")
    private Long userId;

    @Column(name="cart_id")
    private Long shoppingCartId;

}
