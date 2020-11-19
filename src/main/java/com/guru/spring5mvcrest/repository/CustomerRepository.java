package com.guru.spring5mvcrest.repository;

import com.guru.spring5mvcrest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
