package com.example.finalprojectexample.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter //Lombok
@Setter //Lombok

public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String category;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;  // nu se vede in my sql, se realizeaza in spate ---
    // --- mapare ajuta la debugging, ajuta la operatii, etc

}
