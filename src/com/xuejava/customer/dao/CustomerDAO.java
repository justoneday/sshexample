package com.xuejava.customer.dao;

import java.util.List;

import com.xuejava.customer.model.Customer;

public interface CustomerDAO {
	
	void addCustomer(Customer customer);
	List<Customer>listCustomer();

}
