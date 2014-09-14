package com.xuejava.customer.bo.impl;

import java.util.List;

import com.xuejava.customer.bo.CustomerBo;
import com.xuejava.customer.dao.CustomerDAO;
import com.xuejava.customer.model.Customer;

public class CustomerBoImpl implements CustomerBo {
	
	CustomerDAO customerDAO;

	//通过Spring依赖注入
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	//调用DAO来保存customer
	@Override
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
		
	}

	//调用DAO来返回customer数组
	@Override
	public List<Customer> listCustomer() {
		
		return customerDAO.listCustomer();
	}

}
