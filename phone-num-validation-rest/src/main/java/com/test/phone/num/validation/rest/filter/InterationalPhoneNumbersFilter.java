package com.test.phone.num.validation.rest.filter;

import com.test.phone.num.validation.common.defines.constant.Country;
import com.test.phone.num.validation.common.logger.InternationalPhoneNumberValidationLogger;
import com.test.phone.num.validation.rest.database.facade.CustomerFacade;
import com.test.phone.num.validation.rest.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

/**
 *
 * @author nour.ihab
 */
@Component
public class InterationalPhoneNumbersFilter {

    @Autowired
    private CustomerFacade customerFacade;

    public Model getCustomerByCountryCode(Model model) {
        List<Customer> customerCameroonPhoneList = null;
        List<Customer> customerEthiopiaPhoneList = null;
        List<Customer> customerMoroccoPhoneList = null;
        List<Customer> customerMozambiquePhoneList = null;
        List<Customer> customerUgandaPhoneList = null;
        try {

            InternationalPhoneNumberValidationLogger.info("Retriving All Customers In Cameroon.....");
            customerCameroonPhoneList = customerFacade.getAllCameroonPhoneNumbers();
            InternationalPhoneNumberValidationLogger.info(" All Customers In Cameroon Retrived Successfully: " + customerCameroonPhoneList);

            InternationalPhoneNumberValidationLogger.info("Retriving All Customers In Ethiopia...........");
            customerEthiopiaPhoneList = customerFacade.getAllEthiopiaPhoneNumbers();
            InternationalPhoneNumberValidationLogger.info("All Customers In Ethiopia Retrived Successfully: " + customerEthiopiaPhoneList);

            InternationalPhoneNumberValidationLogger.info("Retriving All Customers In Morocco.............");
            customerMoroccoPhoneList = customerFacade.getAllMoroccoPhoneNumbers();
            InternationalPhoneNumberValidationLogger.info("All Customers In Morocco  Retrived Successfully: " + customerMoroccoPhoneList);

            InternationalPhoneNumberValidationLogger.info("Retriving All Customers In Mozambique...........");
            customerMozambiquePhoneList = customerFacade.getAllMozambiquePhoneNumbers();
            InternationalPhoneNumberValidationLogger.info(" All Customers In Mozambique  Retrived Successfully: " + customerMozambiquePhoneList);

            InternationalPhoneNumberValidationLogger.info("Retriving All Customers In Uganda.........");
            customerUgandaPhoneList = customerFacade.getAllUgandaPhoneNumbers();
            InternationalPhoneNumberValidationLogger.info(" All Customers In Uganda  Retrived Successfully: " + customerUgandaPhoneList);

            if (customerCameroonPhoneList != null && customerEthiopiaPhoneList != null && customerMoroccoPhoneList != null
                    && customerMozambiquePhoneList != null && customerUgandaPhoneList != null) {
                model.addAttribute("customerCameroonPhoneList", customerCameroonPhoneList);
                model.addAttribute("customerEthiopiaPhoneList", customerEthiopiaPhoneList);
                model.addAttribute("customerMoroccoPhoneList", customerMoroccoPhoneList);
                model.addAttribute("customerMozambiquePhoneList", customerMozambiquePhoneList);
                model.addAttribute("customerUgandaPhoneList", customerUgandaPhoneList);
            }

        } catch (NullPointerException ex) {
            InternationalPhoneNumberValidationLogger.error("Null Pointer Exception Occurred, Object is null", ex);
        }
        return model;
    }

    public Model renderCountryList(Model model) {
        List<Country> countryList = new ArrayList<>();
        try {
            InternationalPhoneNumberValidationLogger.info("Retriving Country List");
            countryList.add(Country.SELECT_YOUR_COUNTRY);
            countryList.add(Country.CAMEROON);
            countryList.add(Country.ETHIOPIA);
            countryList.add(Country.MORCCO);
            countryList.add(Country.MOZAMBIQUE);
            countryList.add(Country.UGANDA);

            if (countryList != null) {

                InternationalPhoneNumberValidationLogger.info("Country List Retrived Successfully.....");
                InternationalPhoneNumberValidationLogger.info(" Retrived Country List: " + countryList);
                model.addAttribute("countryList", countryList);
            }

        } catch (NullPointerException ex) {
            InternationalPhoneNumberValidationLogger.error("Null Pointer Exception Occurred, countryList is null", ex);
        }
        return model;
    }

}
