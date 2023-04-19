package com.example.thy_thu_shop_back_end.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<Product> productSet;

    public Category(int categoryId, String categoryName, Set<Product> productSet) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.productSet = productSet;
    }

    public Category() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }
}
