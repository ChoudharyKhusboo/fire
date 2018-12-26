package com.practice.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    private int productId;

    @Column(name="product_name")
    private String productName;

    @Column(name="price")
    private double price;

    //This is the product inventory. Total quantity of product in stock
    private int quantity;

    //Note:
    @Column(name="created_date")
    @CreationTimestamp
    private Date createdDate;

    @Column(name="update_date")
    @UpdateTimestamp
    private Date updatedDate;
}

