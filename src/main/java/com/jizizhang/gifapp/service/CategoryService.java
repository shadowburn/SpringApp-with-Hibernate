package com.jizizhang.gifapp.service;

import com.jizizhang.gifapp.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);
}
