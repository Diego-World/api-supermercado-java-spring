package com.marketapp.demo.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;
    @Column
    private Double price;
    @Column
    private Department Department;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public com.marketapp.demo.models.Department getDepartment() {
        return Department;
    }

    public void setDepartment(com.marketapp.demo.models.Department department) {
        Department = department;
    }
}
