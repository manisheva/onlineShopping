package com.online.shopping.customerDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.shopping.model.CustomerBO;

public interface CustomerJPARespository extends JpaRepository<CustomerBO, Long>{
	public CustomerBO findByFname(String nnn);
}