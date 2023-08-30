package com.yaga.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String photoUrl;

    @Column(nullable = false)
    private double price;

    @ManyToMany(mappedBy = "products")
    private List<Cart> carts = new ArrayList<>();

}
