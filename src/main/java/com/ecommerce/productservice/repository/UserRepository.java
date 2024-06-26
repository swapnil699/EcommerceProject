package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
//    Optional<User> findByName(String name);  this not work get call
        List<User> findByName(String name);
//    Optional<User> findById(Long id);
//
//    List<User> findAllByNameEndingWith(String suffix);
//    User save(User Entity);
}
