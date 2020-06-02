package com.curso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
