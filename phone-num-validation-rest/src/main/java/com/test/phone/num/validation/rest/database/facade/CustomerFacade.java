package com.test.phone.num.validation.rest.database.facade;

import com.test.phone.num.validation.rest.database.service.CustomerService;
import com.test.phone.num.validation.rest.entity.Customer;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author nour.ihab
 */
@Component
@Transactional
public class CustomerFacade {

    @Autowired
    private CustomerService customerService;

    public List<String> getAllPhoneNumbers() {
        return customerService.getAllPhoneNumbers();
    }

    public List<Customer> getAllCustomers() {

        return customerService.findAllCustomers();
    }

    public List<Customer> getAllCameroonPhoneNumbers() {
        return customerService.getAllCameroonPhoneNumbers();
    }

    public List<Customer> getAllEthiopiaPhoneNumbers() {
        return customerService.getAllEthiopiaPhoneNumbers();
    }

    public List<Customer> getAllMoroccoPhoneNumbers() {
        return customerService.getAllMoroccoPhoneNumbers();
    }

    public List<Customer> getAllMozambiquePhoneNumbers() {
        return customerService.getAllMozambiquePhoneNumbers();
    }

    public List<Customer> getAllUgandaPhoneNumbers() {
        return customerService.getAllUgandaPhoneNumbers();
    }

   
}
