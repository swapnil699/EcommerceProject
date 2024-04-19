package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class Learner extends User{
    private String university;
    private double psp;
}
