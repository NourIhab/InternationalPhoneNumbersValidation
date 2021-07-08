package com.test.phone.num.validation.rest.mapper;

import com.test.phone.num.validation.rest.dto.CustomerDto;
import com.test.phone.num.validation.rest.entity.Customer;

/**
 *
 * @author nour.ihab
 */
public class CustomerMapper {

    public static Customer parseFromDTO(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setCountry(customerDto.getCountry());
        customer.setCustomerId(customerDto.getCustomerId());
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerPhone(customerDto.getCustomerPhone());
        
        return customer;
    }

    public static CustomerDto parseToDTO(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCountry(customer.getCountry());
        customerDto.setCustomerId(customer.getCustomerId());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setCustomerPhone(customer.getCustomerPhone());

        return customerDto;
    }
}
