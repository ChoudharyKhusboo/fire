package com.practice.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="shopping_cart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="shopping_cart_id")
    private long shoppingCartId;

    @OneToOne
    @Column(name="user_id")
    private long userId;

    @Column(name="created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name="update_at")
    @UpdateTimestamp
    private Date updatedAt;

    private Long deliveryAddressId;


    public long getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(long shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getDeliveryAddressId() {
        return deliveryAddressId;
    }

    public void setDeliveryAddressId(Long deliveryAddressId) {
        this.deliveryAddressId = deliveryAddressId;
    }
}
