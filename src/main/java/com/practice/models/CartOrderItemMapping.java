package com.practice.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="cart_order_item_mapping")
public class CartOrderItemMapping {

    @Column(name="shopping_cart_id")
    private long shoppingCartId;

    @Column(name="order_item_id")
    private long orderItemId;
}
