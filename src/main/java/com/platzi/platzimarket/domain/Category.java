package com.platzi.platzimarket.domain;

import lombok.Data;

public class Category {
    private Long categoryId;
    private String category;
    private boolean active;

    public Long getCategoryId() {
        return categoryId;
    }

    public String getCategory() {
        return category;
    }

    public boolean isActive() {
        return active;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
