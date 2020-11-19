package com.guru.spring5mvcrest.api.mapper;

import com.guru.spring5mvcrest.api.model.CateogryDTO;
import com.guru.spring5mvcrest.model.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryMapperTest {

    private final String NAME = "name";
    private final Long ID = 1L;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDTO() throws Exception {

        Category category = new Category();
        category.setName(NAME);
        category.setId(ID);

        CateogryDTO cateogryDTO = categoryMapper.categoryToCategoryDTO(category);

        assertEquals(ID, cateogryDTO.getId());
        assertEquals(NAME, cateogryDTO.getName());
    }

}