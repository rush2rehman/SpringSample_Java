package com.mycompany.repository;

import java.util.List;

import com.mycompany.model.customer;

public interface CustomerRepo {

	public abstract List<customer> findAll();

}