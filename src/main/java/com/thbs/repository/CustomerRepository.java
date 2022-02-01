package com.thbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thbs.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String> {

}
