package com.practice.controllers;

import com.practice.dtos.UserCartDetailsDto;
import com.practice.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;


    //TODO: What if the user is not logged in? How will you get the userId?
    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addItemToCart(@RequestParam long userId, @RequestParam long orderItemId){
        shoppingCartService.addOrderItemToCart(userId, orderItemId);
    }

//    @DeleteMapping
//    public void removeProductFromCart(){
//
//    }

    @GetMapping
    public List<UserCartDetailsDto> getOrderItemDetailsInCart(@RequestParam Long userId){
        return shoppingCartService.getCartDetails(userId);
    }
}
