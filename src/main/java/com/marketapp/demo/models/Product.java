package com.marketapp.demo.models;

public class Product {
    private Long id;
    private String name;
    private Double price;
    private Department Department;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
