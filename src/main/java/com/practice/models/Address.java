package com.practice.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="address")
public class Address {

    @Id
    @Column(name="address_id")
    private long addressId;

    private int pincode;

    private String streetAddress;

}
