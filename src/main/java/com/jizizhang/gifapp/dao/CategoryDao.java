package com.jizizhang.gifapp.dao;

import com.jizizhang.gifapp.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);
}
