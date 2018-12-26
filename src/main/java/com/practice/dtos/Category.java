package com.practice.dtos;

import lombok.Builder;
import lombok.Data;
import java.util.Date;

@Data
@Builder
public class Category {

    private int categoryId;
    private String categoryName;
    private Date createdAt;
}
