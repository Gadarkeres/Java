package com.educandoweb.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.repositores.CategoryRepository;

import com.educandoweb.course.entities.Category;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository  categoryRepository; // CategoryService depende de CategoryRepository

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        return categoryRepository.findById(id).get();
    }


}
