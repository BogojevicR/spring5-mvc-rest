package com.guru.spring5mvcrest.api.mapper;

import com.guru.spring5mvcrest.api.model.CateogryDTO;
import com.guru.spring5mvcrest.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CateogryDTO categoryToCategoryDTO(Category category);
}
