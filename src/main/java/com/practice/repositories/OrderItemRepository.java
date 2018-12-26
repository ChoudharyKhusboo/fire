package com.practice.repositories;

import com.practice.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    @Query(nativeQuery = true, value="select * from cart_order_item_mapping where shopping_cart_id = :shoppingCartId")
    List<Long> findOrderItemByShoppingCartId(Long shoppingCartId);

    @Query(nativeQuery = true, value="select * from order_item where order_item_id in :orderItemIds")
    List<OrderItem> getOrderItemListByIds(String orderItemIds);
}
