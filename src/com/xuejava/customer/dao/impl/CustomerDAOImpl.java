package com.xuejava.customer.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xuejava.customer.dao.CustomerDAO;
import com.xuejava.customer.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	
	SessionFactory sessionFactory;

	// Spring“¿¿µ◊¢»Î
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getCurrentSession(){
		return sessionFactory.openSession();
	}
	

	@Override
	public void addCustomer(Customer customer) {
		Session session=this.getCurrentSession();
		//session.save(customer);
		Transaction ts;
		try {
			ts=session.beginTransaction();			
			session.save(customer);
			ts.commit();
		} finally {
			session.close();
		}
		
	}

	@Override
	public List<Customer> listCustomer() {
		Session session=this.getCurrentSession();
		Query query=session.createQuery("from Customer");
		return query.list();
	}

	
}
