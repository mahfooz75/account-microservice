package com.mahfooz.accounts.service;

import java.time.LocalDate;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mahfooz.accounts.model.Accounts;
import com.mahfooz.accounts.model.Customer;
import com.mahfooz.accounts.repository.AccountsRepository;
import com.mahfooz.accounts.repository.CustomerRepository;

@Service
public class AccountDetailService {
  @Autowired
  private AccountsRepository accountsRepository;
  @Autowired
  private CustomerRepository CustomerRepository;

  public Accounts findByCustomerId(int customerId) {
    return accountsRepository.findByCustomerId(customerId);
  }

  @Transactional
  public Accounts createAccountDetails() {
    Customer customer = new Customer(1, "Mahfooz", "mah@gmail.com", "123456789", LocalDate.now());
    CustomerRepository.save(customer);
    
    Accounts account = new Accounts(1, customer.getCustomerId(), "Saving", "Pune", LocalDate.now());
    return accountsRepository.save(account);
  }
  
  
}
