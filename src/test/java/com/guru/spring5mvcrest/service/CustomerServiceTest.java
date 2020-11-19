package com.guru.spring5mvcrest.service;

import com.guru.spring5mvcrest.api.v1.mapper.CustomerMapper;
import com.guru.spring5mvcrest.api.v1.model.CustomerDTO;
import com.guru.spring5mvcrest.model.Customer;
import com.guru.spring5mvcrest.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    public static final Long ID = 1L;
    public static final String FIRST_NAME = "Bob";
    public static final String LAST_NAME = "Axe";
    CustomerService customerService;

    @Mock
    CustomerRepository customerRepository;

    @BeforeEach
    public void setUp() {
        customerService = new CustomerServiceImpl(CustomerMapper.INSTANCE, customerRepository);
    }

    @Test
    public void testGetAllCustomers() throws Exception {
        Customer customer1 = new Customer();
        customer1.setId(ID);
        customer1.setFirstName(FIRST_NAME);
        customer1.setLastName(LAST_NAME);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setFirstName("Sam");
        customer2.setLastName("Ross");

        when(customerRepository.findAll()).thenReturn(Arrays.asList(customer1, customer2));

        List<CustomerDTO> customers = customerService.getAllCustomers();

        assertEquals(2, customers.size());

    }

    @Test
    public void testGetCustomerById() throws Exception {
        Customer customer1 = new Customer();
        customer1.setId(ID);
        customer1.setFirstName(FIRST_NAME);
        customer1.setLastName(LAST_NAME);

        when(customerRepository.findById(anyLong())).thenReturn(java.util.Optional.of(customer1));

        CustomerDTO customers = customerService.getCustomerById(ID);

        assertEquals(ID, customer1.getId());
        assertEquals(FIRST_NAME, customer1.getFirstName());
        assertEquals(LAST_NAME, customer1.getLastName());

    }


}