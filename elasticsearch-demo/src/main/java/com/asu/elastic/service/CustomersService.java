package com.asu.elastic.service;

import com.asu.elastic.repository.CustomerRepository;
import com.asu.elastic.models.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomersService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getByUserName(String name) {
        return customerRepository.findByUserName(name);
    }

    public Optional<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    public Iterable<Customer> findALL() {
        return customerRepository.findAll();
    }

    public long countById(){
        return customerRepository.count();
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
