package com.sk.cutomermanagement.repository;

import com.sk.cutomermanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
  Optional<Customer> findOneByEmailAndPassword(String customerName, String Password);

  Customer findByEmail(String email);
}
