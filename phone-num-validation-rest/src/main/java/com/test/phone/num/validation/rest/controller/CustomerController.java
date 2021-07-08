package com.test.phone.num.validation.rest.controller;

import com.test.phone.num.validation.rest.database.facade.CustomerFacade;
import com.test.phone.num.validation.common.defines.UIDefines;
import com.test.phone.num.validation.common.logger.InternationalPhoneNumberValidationLogger;
import com.test.phone.num.validation.rest.filter.InterationalPhoneNumbersFilter;
import java.util.ArrayList;
import com.test.phone.num.validation.rest.entity.Customer;
import com.test.phone.num.validation.rest.dto.CustomerDto;
import com.test.phone.num.validation.rest.mapper.CustomerMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nour.ihab
 */
@Controller
@RequestMapping(path = "/")
public class CustomerController {

    @Autowired
    private CustomerFacade customerFacade;
    @Autowired
    InterationalPhoneNumbersFilter phoneNumbers;
    private ApplicationContext context;

    @Autowired
    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    @GetMapping(path = UIDefines.CustomerDetailsPage.METHODNAME)
    public String getAllCustomers(Model model) throws Exception {
        List<CustomerDto> customerDtoList = new ArrayList<>();
        try {
            if (customerFacade != null) {
                InternationalPhoneNumberValidationLogger.info("Retriving All Customers......");

                List<Customer> customerList = customerFacade.getAllCustomers();
                if (customerList != null && customerDtoList != null) {
                    customerList.forEach(customer -> {
                        customerDtoList.add(CustomerMapper.parseToDTO(customer));
                    });
                    model.addAttribute("customerList", customerDtoList);
                }
                InternationalPhoneNumberValidationLogger.info("Retriving All Customers By Country and Country Code......");
                if (phoneNumbers != null) {
                    phoneNumbers.getCustomerByCountryCode(model);
                    phoneNumbers.renderCountryList(model);
                }

                InternationalPhoneNumberValidationLogger.info("Adding Customer Fields .....");
                model.addAttribute("id", UIDefines.CustomerDetailsPage.ID);
                model.addAttribute("name", UIDefines.CustomerDetailsPage.NAME);
                model.addAttribute("phone", UIDefines.CustomerDetailsPage.PHONE);
                model.addAttribute("country", UIDefines.CustomerDetailsPage.COUNTRY);
            }
        } catch (NullPointerException ex) {
            InternationalPhoneNumberValidationLogger.error("Null Pointer Exception Occurred, Object is null", ex);
        }

        return UIDefines.CustomerDetailsPage.PAGENAME;
    }

}
