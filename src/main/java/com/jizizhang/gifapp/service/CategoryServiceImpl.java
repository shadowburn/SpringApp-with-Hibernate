package com.jizizhang.gifapp.service;

import com.jizizhang.gifapp.model.Category;
import com.jizizhang.gifapp.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryDao.findById(id);
    }

    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public void delete(Category category) {
        categoryDao.delete(category);
    }
}
