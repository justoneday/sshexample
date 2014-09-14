package com.xuejava.customer.bo;

import java.util.List;

import com.xuejava.customer.model.Customer;

public interface CustomerBo {
	
	void addCustomer(Customer customer);
	List<Customer>listCustomer();

}
