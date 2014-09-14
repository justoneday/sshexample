package com.xuejava.customer.bo.impl;

import java.util.List;

import com.xuejava.customer.bo.CustomerBo;
import com.xuejava.customer.dao.CustomerDAO;
import com.xuejava.customer.model.Customer;

public class CustomerBoImpl implements CustomerBo {
	
	CustomerDAO customerDAO;

	//ͨ��Spring����ע��
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	//����DAO������customer
	@Override
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
		
	}

	//����DAO������customer����
	@Override
	public List<Customer> listCustomer() {
		
		return customerDAO.listCustomer();
	}

}
