package com.guru.spring5mvcrest.service;

import com.guru.spring5mvcrest.api.v1.mapper.CategoryMapper;
import com.guru.spring5mvcrest.api.v1.model.CategoryDTO;
import com.guru.spring5mvcrest.model.Category;
import com.guru.spring5mvcrest.repository.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoryServiceTest {

    public static final Long ID = 2L;
    public static final String NAME = "Name";
    CategoryService categoryService;

    @Mock
    CategoryRepository categoryRepository;

    @BeforeEach
    public void setUp() {
        categoryService = new CategoryServiceImpl(CategoryMapper.INSTANCE, categoryRepository);
    }


    @Test
    public void getAllCategories() throws Exception {

        List<Category> categories = Arrays.asList(new Category(), new Category(), new Category());

        when(categoryRepository.findAll()).thenReturn(categories);

        List<CategoryDTO> categoryDTOS = categoryService.getAllCategories();

        assertEquals(3, categoryDTOS.size());
    }

    @Test
    public void getCategoryByName() throws Exception {

        Category category = new Category();
        category.setId(ID);
        category.setName(NAME);

        when(categoryRepository.findByName(anyString())).thenReturn(category);

        CategoryDTO categoryDTO = categoryService.getCategoryByName(NAME);

        assertEquals(ID, categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());

    }

}