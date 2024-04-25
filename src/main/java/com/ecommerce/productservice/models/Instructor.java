package com.ecommerce.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Setter
public class Instructor extends User{
    private double salary;
    private String skill;
    @OneToMany(fetch = jakarta.persistence.FetchType.EAGER, mappedBy = "instructor", cascade =  CascadeType.REFRESH)
    @Fetch(FetchMode.SELECT)
    private List<Batch> batch;
}
