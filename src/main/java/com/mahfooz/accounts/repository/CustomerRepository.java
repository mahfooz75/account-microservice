package com.mahfooz.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mahfooz.accounts.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
