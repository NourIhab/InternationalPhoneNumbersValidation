package com.test.phone.num.validation.rest.database.service;

import com.test.phone.num.validation.rest.entity.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.phone.num.validation.rest.database.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author nour.ihab
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<String> getAllPhoneNumbers() {
        return customerRepository.getAllPhoneNumbers();
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> getAllCameroonPhoneNumbers() {
        return customerRepository.getAllCameroonPhoneNumbers();
    }

    public List<Customer> getAllEthiopiaPhoneNumbers() {
        return customerRepository.getAllEthiopiaPhoneNumbers();
    }

    public List<Customer> getAllMoroccoPhoneNumbers() {
        return customerRepository.getAllMoroccoPhoneNumbers();
    }

    public List<Customer> getAllMozambiquePhoneNumbers() {
        return customerRepository.getAllMozambiquePhoneNumbers();
    }

    public List<Customer> getAllUgandaPhoneNumbers() {
        return customerRepository.getAllUgandaPhoneNumbers();
    }

   
}
