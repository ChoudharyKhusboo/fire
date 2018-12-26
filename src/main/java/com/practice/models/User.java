package com.practice.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private int userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="created_date")
    @CreationTimestamp
    private Date createdDate;
}
