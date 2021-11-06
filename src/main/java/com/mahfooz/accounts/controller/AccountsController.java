package com.mahfooz.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mahfooz.accounts.model.Accounts;
import com.mahfooz.accounts.model.Customer;
import com.mahfooz.accounts.service.AccountDetailService;

@RestController
public class AccountsController {
  @Autowired
  private AccountDetailService service;

  @GetMapping("/myAccount")
  public Accounts getAccountDetails(@RequestBody Customer customer) {
    Accounts accounts = service.findByCustomerId(customer.getCustomerId());
    if (accounts != null) {
      return accounts;
    } else {
      return null;
    }
  }
  
  @PostMapping("/myAccount")
  public Accounts saveAccountDetails() {
    Accounts accounts = service.createAccountDetails();
    if (accounts != null) {
      return accounts;
    } else {
      return null;
    }
  }

}
