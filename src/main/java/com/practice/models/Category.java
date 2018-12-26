package com.practice.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id")
    private int categoryId;

    @Column(name="category_name")
    private String categoryName;

    @Column(name="created_date")
    //We need not set the current timestamp, when entity is created it will auto insert the current timestamp
    @CreationTimestamp
    private Date createdDate;

    @Column(name="parent_category_id")
    //Integer type because it can be null
    private Integer parentCategoryId;

}
