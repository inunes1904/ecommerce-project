package com.ecommerceapp.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="product_category")
public class ProductCategory {
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name="category_name")
  private String categoryName;

  @OneToMany(cascade= CascadeType.ALL, mappedBy = "category")
  private Set<Product> products;
}
