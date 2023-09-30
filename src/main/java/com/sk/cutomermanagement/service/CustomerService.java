package com.sk.cutomermanagement.service;

import com.sk.cutomermanagement.dto.CustomerDto;
import com.sk.cutomermanagement.dto.LoginDto;
import com.sk.cutomermanagement.entity.Customer;
import com.sk.cutomermanagement.payload.response.LoginResponse;
import org.springframework.stereotype.Service;

public interface CustomerService {
  Customer addCustomer(CustomerDto userDto);

  Customer getCustomerByEmail(String email);

  LoginResponse loginCustomer(LoginDto loginDto);
}
