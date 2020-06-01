package com.curso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
