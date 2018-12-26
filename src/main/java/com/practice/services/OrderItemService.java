package com.practice.services;

import com.practice.models.OrderItem;
import com.practice.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    OrderItemRepository orderItemRepository;

    //Bulk API to get all order items in one DB call
    public List<OrderItem> getOrderItemListfromIds(List<Long> orderItemIds){

        StringBuilder itemIds = new StringBuilder("(");
        //orderItemIds.stream().forEach(x -> itemIds = itemIds + x);

        for(Long id: orderItemIds){
            itemIds.append(id);
            itemIds.append(',');
        }
        itemIds.deleteCharAt(itemIds.lastIndexOf(","));
        itemIds.append(')');

        return orderItemRepository.getOrderItemListByIds(itemIds.toString());
    }

    public List<OrderItem> getOrderItemDetailsFromCart(Long cartId){
        List<Long> orderItemIds = orderItemRepository.findOrderItemByShoppingCartId(cartId);

        return getOrderItemListfromIds(orderItemIds);


    }
}
