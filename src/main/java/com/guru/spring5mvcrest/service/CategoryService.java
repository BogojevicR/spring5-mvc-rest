package com.guru.spring5mvcrest.service;

import com.guru.spring5mvcrest.api.model.CateogryDTO;

import java.util.List;

public interface CategoryService {

    List<CateogryDTO> getAllCategories();

    CateogryDTO getCategoryByName(String name);
}
