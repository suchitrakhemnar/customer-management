package com.sk.cutomermanagement.service;

import com.sk.cutomermanagement.dto.CustomerDto;
import com.sk.cutomermanagement.entity.Customer;
import org.springframework.stereotype.Service;


public interface CustomerService {
    Customer addUser(CustomerDto userDto);
}
