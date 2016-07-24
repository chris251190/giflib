package com.teamtreehouse.giflib.service;

import com.teamtreehouse.giflib.model.Category;

import java.util.List;

/**
 * Created by steph on 24.07.2016.
 */
public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);
}
