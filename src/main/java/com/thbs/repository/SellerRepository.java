package com.thbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thbs.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller,String> {
	

}
