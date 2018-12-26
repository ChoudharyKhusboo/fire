package com.practice.repositories;

import com.practice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    //TODO: Read about how use of Optional here will help to avoid NPE
    //TODO: Diff between nativeQuery = true and false
    @Query(nativeQuery = true, value="select * from order where user_id = :userId")
    List<Order> findByUserId(Long userId);
}
