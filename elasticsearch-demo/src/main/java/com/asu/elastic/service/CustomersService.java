package com.asu.elastic.service;

import com.asu.elastic.repository.CustomerRepository;
import com.asu.elastic.models.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getByUserName(String name) {
        return customerRepository.findByUserName(name);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
