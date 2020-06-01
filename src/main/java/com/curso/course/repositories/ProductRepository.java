package com.curso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
