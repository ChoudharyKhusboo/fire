package com.practice.services;

import com.practice.dtos.Product;
import com.practice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product getProductById(Long productId){
        return productRepository.findProductById(productId);
    }

}
