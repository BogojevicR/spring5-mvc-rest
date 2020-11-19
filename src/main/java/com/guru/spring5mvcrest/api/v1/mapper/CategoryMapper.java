package com.guru.spring5mvcrest.api.v1.mapper;

import com.guru.spring5mvcrest.api.v1.model.CategoryDTO;
import com.guru.spring5mvcrest.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
