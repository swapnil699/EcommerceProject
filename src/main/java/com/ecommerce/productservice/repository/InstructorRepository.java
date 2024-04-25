package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.models.Instructor;
import com.ecommerce.productservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface InstructorRepository extends JpaRepository<Instructor,UUID> {
    List<Instructor> findByName(String name);
    Optional<Instructor> findById(UUID uuid);
    List<Instructor> findAllById(UUID uuid);
}
