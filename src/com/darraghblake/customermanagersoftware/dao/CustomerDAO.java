package com.darraghblake.customermanagersoftware.dao;

import java.util.List;

import com.darraghblake.customermanagersoftware.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
}