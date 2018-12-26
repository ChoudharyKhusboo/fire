package com.practice.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="order_order_item_mapping")
public class OrderItemOrderMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_orderitem_mapping_id")
    private int orderItemOrderMappingId;

    @Column(name="order_id")
    private int orderId;

    @Column(name="order_item_id")
    private int orderItemId;

}
