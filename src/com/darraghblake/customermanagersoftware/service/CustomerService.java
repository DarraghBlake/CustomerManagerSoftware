package com.darraghblake.customermanagersoftware.service;

import java.util.List;

import com.darraghblake.customermanagersoftware.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
