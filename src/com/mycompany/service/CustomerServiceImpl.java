package com.mycompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mycompany.model.customer;
import com.mycompany.repository.CustomerRepo;
import com.mycompany.repository.HibernateCustomerRepoImpl;

@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {
	
	/* (non-Javadoc)
	 * @see com.mycompany.service.CustomerService#findAll()
	 */
	
	private CustomerRepo repo;
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public CustomerServiceImpl(CustomerRepo repo) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
		this.repo = repo;
	}
	
	
	public void setRepo(CustomerRepo repo) {
		
		this.repo = repo;
	}

	@Override
	public List<customer> findAll()
	{
		return new HibernateCustomerRepoImpl().findAll();
	}

}
