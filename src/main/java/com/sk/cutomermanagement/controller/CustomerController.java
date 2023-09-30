package com.sk.cutomermanagement.controller;

import com.sk.cutomermanagement.dto.CustomerDto;
import com.sk.cutomermanagement.dto.LoginDto;
import com.sk.cutomermanagement.entity.Customer;
import com.sk.cutomermanagement.service.CustomerService;
import org.hibernate.query.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

  @Autowired private CustomerService customerService;

  @GetMapping("/greet")
  public String greet() {
    return "Hello!";
  }

  @PostMapping("/save")
  public Customer saveCustomer(@RequestBody CustomerDto customerDto) {
    return customerService.addCustomer(customerDto);
  }

  @GetMapping("/customer")
  public Customer getCustomerByEmail(@RequestParam String email) {
    return customerService.getCustomerByEmail(email);
  }

  @PostMapping("/login")
  public ResponseEntity<?> loginCustomer(@RequestBody LoginDto loginDto) {
    return ResponseEntity.ok(customerService.loginCustomer(loginDto));
  }
}
