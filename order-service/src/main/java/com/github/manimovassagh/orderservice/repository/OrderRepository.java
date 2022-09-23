package com.github.manimovassagh.orderservice.repository;

import com.github.manimovassagh.orderservice.dto.OrderRequest;
import com.github.manimovassagh.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
