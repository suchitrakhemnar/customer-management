package com.sk.cutomermanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
  @Id
  @Column(name = "cus_id", length = 20)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int customerId;

  @Column(name = "cus_name", length = 255)
  private String customerName;

  @Column(name = "cus_email", length = 255)
  private String email;

  @Column(name = "cus_password", length = 255)
  private String password;

  public Customer() {}

  public Customer(int userId, String userName, String email, String password) {
    this.customerId = userId;
    this.customerName = userName;
    this.email = email;
    this.password = password;
  }

  public int getUserId() {
    return customerId;
  }

  public void setUserId(int userId) {
    this.customerId = userId;
  }

  public String getUserName() {
    return customerName;
  }

  public void setUserName(String userName) {
    this.customerName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Customer{"
        + "customerId="
        + customerId
        + ", customerName='"
        + customerName
        + '\''
        + ", email='"
        + email
        + '\''
        + ", password='"
        + password
        + '\''
        + '}';
  }
}
