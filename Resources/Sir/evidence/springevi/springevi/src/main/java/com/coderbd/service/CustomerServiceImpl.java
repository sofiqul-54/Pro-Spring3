package com.coderbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.Customer;
import com.coderbd.exception.ResourceNotFoundException;
import com.coderbd.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerRepository.save(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) throws ResourceNotFoundException {
		return customerRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException(id));
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerRepository.deleteById(theId);
	}
}





