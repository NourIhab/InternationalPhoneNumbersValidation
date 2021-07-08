package com.test.phone.num.validation.rest.controller;

import com.test.phone.num.validation.common.defines.DataBaseDefines;
import com.test.phone.num.validation.rest.database.Repository.CustomerRepository;
import com.test.phone.num.validation.rest.entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 *
 * @author nour.ihab
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
@WebMvcTest(CustomerController.class)
@RunWith(SpringRunner.class)
public class CustomerControllerTesting {

    List<Customer> customer = null;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MockMvc mvc;

    @Test
    public void customer() throws Exception {
        customer = customerRepository.findAll();
        Assertions.assertThat(customer.size()).isGreaterThan(0);
    }

    @Test
    public void cameroonFistCustomer() throws Exception {
        customer = customerRepository.getAllCameroonPhoneNumbers();
        Assertions.assertThat(customer.get(0).getCustomerPhone()).isEqualTo("(237) 697151594");
    }

    @Test
    public void allCameroonCustomer() throws Exception {
        customer = customerRepository.getAllCameroonPhoneNumbers();
        for (int i = 0; i <= customer.size(); i++) {
            assertTrue(customer.get(i).getCustomerPhone().startsWith(DataBaseDefines.PhoneNumberCode.CAMEROON_CODE),
                    customer.get(i).getCustomerPhone());
        }
    }

    @Test
    public void allEthiopiaCustomer() throws Exception {
        customer = customerRepository.getAllCameroonPhoneNumbers();
        for (int i = 0; i <= customer.size(); i++) {
            assertTrue(customer.get(i).getCustomerPhone().startsWith(DataBaseDefines.PhoneNumberCode.ETHIOPIA_CODE),
                    customer.get(i).getCustomerPhone());
        }
    }

    @Test
    public void allMoroccoCustomer() throws Exception {
        customer = customerRepository.getAllCameroonPhoneNumbers();
        for (int i = 0; i <= customer.size(); i++) {
            assertTrue(customer.get(i).getCustomerPhone().startsWith(DataBaseDefines.PhoneNumberCode.MOROCCO_CODE),
                    customer.get(i).getCustomerPhone());
        }
    }

    @Test
    public void allMozambiqueCustomer() throws Exception {
        customer = customerRepository.getAllCameroonPhoneNumbers();
        for (int i = 0; i <= customer.size(); i++) {
            assertTrue(customer.get(i).getCustomerPhone().startsWith(DataBaseDefines.PhoneNumberCode.MOZAMBIQUE_CODE),
                    customer.get(i).getCustomerPhone());
        }
    }

    @Test
    public void allUgandaCustomer2() throws Exception {
        customer = customerRepository.getAllCameroonPhoneNumbers();
        for (int i = 0; i <= customer.size(); i++) {
            assertTrue(customer.get(i).getCustomerPhone().startsWith(DataBaseDefines.PhoneNumberCode.UGANDA_CODE),
                    customer.get(i).getCustomerPhone());
        }
    }

    @Test
    public void injectedComponentsAreNotNull() {
        assertThat(dataSource).isNotNull();
        assertThat(jdbcTemplate).isNotNull();
        assertThat(entityManager).isNotNull();
        assertThat(customerRepository).isNotNull();
    }

    @Test
    public void notNullQueries() {
        assertThat(customerRepository.getAllPhoneNumbers()).isNotNull();
        assertThat(customerRepository.getAllCameroonPhoneNumbers()).isNotNull();
        assertThat(customerRepository.getAllEthiopiaPhoneNumbers()).isNotNull();
        assertThat(customerRepository.getAllMoroccoPhoneNumbers()).isNotNull();
        assertThat(customerRepository.getAllMozambiquePhoneNumbers()).isNotNull();
        assertThat(customerRepository.getAllUgandaPhoneNumbers()).isNotNull();
        assertThat(customerRepository.findAll()).isNotNull();

    }
    
     @Test
    public void customerControllerTest() throws Exception {
        RequestBuilder request = get("/customerDetails");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("customerDetails", result.getResponse().getContentAsString());
    }
}
