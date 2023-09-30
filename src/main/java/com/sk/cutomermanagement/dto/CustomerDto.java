package com.sk.cutomermanagement.dto;

public class CustomerDto {
  private int customerId;
  private String customerName;
  private String email;
  private String password;

  public CustomerDto() {}

  public CustomerDto(int customerId, String customerName, String email, String password) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.email = email;
    this.password = password;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
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
    return "CustomerDto{"
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
