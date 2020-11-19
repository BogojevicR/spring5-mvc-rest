package com.guru.spring5mvcrest.api.v1.mapper;

import com.guru.spring5mvcrest.api.v1.model.CustomerDTO;
import com.guru.spring5mvcrest.model.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerMapperTest {

    private final Long ID = 1L;
    private final String FIRST_NAME = "FirstName";
    private final String LAST_NAME = "LastName";
    private final String CUSTOMER_URL = "url";

    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void testCustomerToCustomerDTO() throws Exception {

        Customer customer = new Customer();
        customer.setId(1L);
        customer.setFirstName(FIRST_NAME);
        customer.setLastName(LAST_NAME);
        customer.setCustomerUrl(CUSTOMER_URL);

        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        assertEquals(ID, customerDTO.getId());
        assertEquals(FIRST_NAME, customerDTO.getFirstName());
        assertEquals(LAST_NAME, customerDTO.getLastName());
        assertEquals(CUSTOMER_URL, customerDTO.getCustomerUrl());

    }

}