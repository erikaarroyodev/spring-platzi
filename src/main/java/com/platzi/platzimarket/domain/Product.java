package com.platzi.platzimarket.domain;

import lombok.Data;

import java.math.BigDecimal;

public class Product {

    private Long productId;
    private String name;
    private Long categoryId;
    private BigDecimal price;
    private Integer stock;
    private Boolean active;
    private Category category;

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Boolean getActive() {
        return active;
    }

    public Category getCategory() {
        return category;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
