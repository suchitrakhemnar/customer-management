package com.sk.cutomermanagement.controller;

import com.sk.cutomermanagement.dto.CustomerDto;
import com.sk.cutomermanagement.entity.Customer;
import com.sk.cutomermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/greet")
    public String greet(){
        return "Hello!";
    }

    @PostMapping("/save")
    public Customer saveUser(@RequestBody CustomerDto customerDto) {
        return customerService.addUser(customerDto);
    }
}
