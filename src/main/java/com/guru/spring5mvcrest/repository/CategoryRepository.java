package com.guru.spring5mvcrest.repository;

import com.guru.spring5mvcrest.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
