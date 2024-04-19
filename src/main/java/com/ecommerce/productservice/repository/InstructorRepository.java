package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.models.Instructor;
import com.ecommerce.productservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
