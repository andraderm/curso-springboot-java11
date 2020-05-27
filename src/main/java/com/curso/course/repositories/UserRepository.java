package com.curso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
