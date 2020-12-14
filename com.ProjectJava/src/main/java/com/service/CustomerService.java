package com.service;

import org.springframework.stereotype.Component;

import com.Entity.Borrowtickets;
import com.Entity.Customers;
import com.Entity.Employees;
import com.Request.BorrowTicketsRequest;
import com.Request.CustomerRequest;

import net.minidev.json.JSONObject;

@Component
public interface CustomerService {
	public JSONObject createCustomer(Customers customers);
	public JSONObject findAllCustomer();
	public JSONObject updateCustomer(Customers customers);
	public JSONObject borrowBook(BorrowTicketsRequest borrowTicketsRequest);
	public JSONObject returnBook(BorrowTicketsRequest borrowTicketsRequest);

}
