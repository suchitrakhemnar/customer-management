package com.sk.cutomermanagement.service.impl;

import com.sk.cutomermanagement.dto.CustomerDto;
import com.sk.cutomermanagement.entity.Customer;
import com.sk.cutomermanagement.repository.CustomerRepository;
import com.sk.cutomermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;
    @Override
    public Customer addUser(CustomerDto customerDto) {
        Customer user =
                new Customer(
                        customerDto.getCustomerId(),
                        customerDto.getCustomerName(),
                        customerDto.getEmail(),
                        customerDto.getPassword());
        repository.save(user);
        return user;
    }
}
