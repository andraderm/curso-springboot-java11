package com.curso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
