package com.practice.repositories;

import com.practice.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    @Query(nativeQuery = true, value= "select * from shopping_cart where user_id = :userId")
    ShoppingCart findShoppingCartByUserId(long userId);

    //void addProductToCart(long productId);

    @Query(nativeQuery = true, value="insert into cart_order_item_mapping (shopping_cart_id, order_item_id) values (:shoppingCartId, :orderItemId)")
    void addOrderItemToCart(Long orderItemId, Long shoppingCartId);

    ShoppingCart save();


}
