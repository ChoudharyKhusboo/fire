package com.practice.models;

import com.practice.utils.PaymentModeType;
import com.practice.utils.PaymentStatus;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="payment_id")
    private int paymentId;

    @Column(name="price")
    private double price;

    @Column(name="payment_type")
    private PaymentModeType paymentModeType;

    private PaymentStatus status;

    private Long orderId;
}
