package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Batch {
    @Id
    private Long id;
    private String name;
    private Integer strength;
    @ManyToOne(fetch = FetchType.LAZY)
    private Instructor instructor;
}
