package com.practice.services;

import com.practice.models.Order;
import com.practice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserService userService;

    public List<Order> getAllOrderByUser(Long userId) {
        List<Order> order = orderRepository.findByUserId(userId);

        return order;
        //TODO: Is it required to handle this case as an exception or not?
        //if(Objects.isNull(order))
            //throw new NoOrderFoundException("Order list is empty for user!");


    }
}
