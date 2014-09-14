package com.xuejava.customer.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.xuejava.customer.bo.CustomerBo;
import com.xuejava.customer.model.Customer;

public class CustomerAction implements ModelDriven{
	
	Customer customer=new Customer();
	List<Customer>customerList=new ArrayList<Customer>();
	
	CustomerBo customerBo;

	
	
	@Override
	public Object getModel() {
		return customer;
	}


	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}


	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	public String addCustomer(){
		
		customer.setCreatedDate(new Date());
		customerBo.addCustomer(customer);
		
		customerList=null;
		customerList=customerBo.listCustomer();
		
		return "success";
		
	}
	

}
