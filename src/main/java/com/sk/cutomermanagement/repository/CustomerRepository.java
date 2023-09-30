package com.sk.cutomermanagement.repository;

import com.sk.cutomermanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
  Optional<Customer> findOneByEmailAndPassword(String customerName, String Password);

  Customer findByEmail(String email);
}
