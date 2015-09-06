package com.mycompany.service;

import java.util.List;

import com.mycompany.model.customer;

public interface CustomerService {

	public abstract List<customer> findAll();

}