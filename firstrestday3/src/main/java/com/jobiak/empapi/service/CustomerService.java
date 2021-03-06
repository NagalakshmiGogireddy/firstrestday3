package com.jobiak.empapi.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jobiak.empapi.model.Customer;
import com.jobiak.empapi.repository.CustomerRepository;

//import antlr.collections.List;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	 public Customer addCustomer(Customer customer) {
		 Customer ref=repo.save(customer);
		 return ref;
	 }
	 public Customer modifyCustomer(Customer customer) {
		return repo.save(customer);
		 
	 }
	 public void removeCustomer(Long id) {
		 repo.deleteById(id);
	 }
	public List<Customer> getAll() {
       return  repo.findAll();
	}
}

