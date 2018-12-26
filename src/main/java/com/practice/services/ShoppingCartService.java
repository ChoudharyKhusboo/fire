package com.practice.services;


import com.practice.dtos.UserCartDetailsDto;
import com.practice.models.OrderItem;
import com.practice.models.ShoppingCart;
import com.practice.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Autowired
    OrderItemService orderItemService;

    @Autowired
    ProductService productService;


    public void addOrderItemToCart(long userId, long orderItemId){
        ShoppingCart shoppingCart = shoppingCartRepository.findShoppingCartByUserId(userId);
        shoppingCartRepository.addOrderItemToCart(orderItemId, shoppingCart.getShoppingCartId());
    }


    public ShoppingCart getShoppingCartByUserId(Long userId){
        //Todo: Can handle shopping cart not found exception
        return shoppingCartRepository.findShoppingCartByUserId(userId);
    }


    public List<UserCartDetailsDto> getCartDetails(Long userId){
        List<UserCartDetailsDto> dtoList = new ArrayList<UserCartDetailsDto>();
        UserCartDetailsDto dto = new UserCartDetailsDto();

        //TODO: What if shopping cart id is not found? Do we need to handle that?
        ShoppingCart shoppingCart = shoppingCartRepository.findShoppingCartByUserId(userId);
        List<OrderItem> orderItemList = orderItemService.getOrderItemDetailsFromCart(shoppingCart.getShoppingCartId());

        for(OrderItem item: orderItemList){
            dto.setOrderItemId(item.getOrderItemId());
            dto.setItemPrice(item.getItemPrice());
            dto.setItemQuantity(item.getItemQuantity());
            dto.setDeliveryAddressId(shoppingCart.getDeliveryAddressId());
            dto.setProductId(item.getProductId());
            dto.setProductName(productService.getProductById(item.getProductId()).getProductName());
        }
        return dtoList;
    }
}
