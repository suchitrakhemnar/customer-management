package com.sk.cutomermanagement.service.impl;

import com.sk.cutomermanagement.dto.CustomerDto;
import com.sk.cutomermanagement.dto.LoginDto;
import com.sk.cutomermanagement.entity.Customer;
import com.sk.cutomermanagement.payload.response.LoginResponse;
import com.sk.cutomermanagement.repository.CustomerRepository;
import com.sk.cutomermanagement.service.CustomerService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
  @Autowired private CustomerRepository repository;

  @Override
  public Customer addCustomer(CustomerDto customerDto) {
    Customer customer =
        new Customer(
            customerDto.getCustomerId(),
            customerDto.getCustomerName(),
            customerDto.getEmail(),
            customerDto.getPassword());
    repository.save(customer);
    return customer;
  }

  @Override
  public Customer getCustomerByEmail(String email) {
    Customer customer = repository.findByEmail(email);
    return customer;
  }

  @Override
  public LoginResponse loginCustomer(LoginDto loginDto) {
    String msg = "";
    Customer customer = repository.findByEmail(loginDto.getEmail());
    if (customer != null) {
      String loginPassword = loginDto.getPassword();
      String dbPassword = customer.getPassword();
      if (loginPassword.equals(dbPassword)) {
        Optional<Customer> fetchedUser =
            repository.findOneByEmailAndPassword(loginDto.getEmail(), dbPassword);
        if (fetchedUser.isPresent()) return new LoginResponse("Login Success", true);
        else return new LoginResponse("Login failed", false);
      } else return new LoginResponse("Password does not match", false);
    } else {
      return new LoginResponse("Email Does not exist in system", false);
    }
  }
}
