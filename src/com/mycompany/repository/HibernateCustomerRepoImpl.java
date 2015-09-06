package com.mycompany.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.mycompany.model.customer;

@Repository("customerRepo")
@Scope("singleton")
public class HibernateCustomerRepoImpl implements CustomerRepo  {
	
	/* (non-Javadoc)
	 * @see com.mycompany.repository.CustomerRepo#findAll()
	 */
	@Value("${someProp}")
	private String dummyName;	
	@Override
	public List<customer> findAll()
	{
		System.out.println(dummyName);
		List<customer> customers = new ArrayList<customer>();
		customer c = new customer();
		c.setFirstName(dummyName);//"Kalilur Rahman");
		c.setLastName("Habibullah");
		customers.add(c);
		return customers;
	}

}
