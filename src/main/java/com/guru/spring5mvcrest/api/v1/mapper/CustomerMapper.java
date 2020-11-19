package com.guru.spring5mvcrest.api.v1.mapper;

import com.guru.spring5mvcrest.api.v1.model.CustomerDTO;
import com.guru.spring5mvcrest.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

}
