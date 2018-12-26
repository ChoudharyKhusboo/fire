package com.practice.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="product_category_mapping")
public class ProductCategoryMapping {
    @Column(name="category_id")
    private long categoryId;

    @Column(name="product_id")
    private long productId;

    @Column(name="created_date")
    private Date createdDate;
}
