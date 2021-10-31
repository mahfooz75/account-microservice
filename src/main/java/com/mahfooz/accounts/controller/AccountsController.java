package com.mahfooz.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mahfooz.accounts.model.Accounts;
import com.mahfooz.accounts.model.Customer;
import com.mahfooz.accounts.repository.AccountsRepository;

@RestController
public class AccountsController {
  @Autowired
  private AccountsRepository accountsRepository;

  @PostMapping("/myAccount")
  public Accounts getAccountDetails(@RequestBody Customer customer) {
    Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
    if (accounts != null) {
      return accounts;
    } else {
      return null;
    }
  }

}
