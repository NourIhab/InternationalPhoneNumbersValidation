package com.test.phone.num.validation.rest.database.Repository;

import com.test.phone.num.validation.rest.entity.Customer;
import java.util.List;
import com.test.phone.num.validation.common.defines.DataBaseDefines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author nour.ihab
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  @Query(value = "SELECT " + DataBaseDefines.Customer.CUSTOMER_PHONE + " FROM "
            + DataBaseDefines.Customer.TABLE_NAME, nativeQuery = true)
    List<String> getAllPhoneNumbers();

    @Query(value = "SELECT * FROM " + DataBaseDefines.Customer.TABLE_NAME + " WHERE "
            + DataBaseDefines.Customer.CUSTOMER_PHONE + " LIKE "
            + DataBaseDefines.PhoneNumberCode.CAMEROON_CODE, nativeQuery = true)
    List<Customer> getAllCameroonPhoneNumbers();

    @Query(value = "SELECT * FROM " + DataBaseDefines.Customer.TABLE_NAME + " WHERE "
            + DataBaseDefines.Customer.CUSTOMER_PHONE + " LIKE "
            + DataBaseDefines.PhoneNumberCode.ETHIOPIA_CODE, nativeQuery = true)
    List<Customer> getAllEthiopiaPhoneNumbers();

    @Query(value = "SELECT * FROM " + DataBaseDefines.Customer.TABLE_NAME + " WHERE "
            + DataBaseDefines.Customer.CUSTOMER_PHONE + " LIKE "
            + DataBaseDefines.PhoneNumberCode.MOROCCO_CODE, nativeQuery = true)
    List<Customer> getAllMoroccoPhoneNumbers();

    @Query(value = "SELECT * FROM " + DataBaseDefines.Customer.TABLE_NAME + " WHERE "
            + DataBaseDefines.Customer.CUSTOMER_PHONE + " LIKE "
            + DataBaseDefines.PhoneNumberCode.MOZAMBIQUE_CODE, nativeQuery = true)
    List<Customer> getAllMozambiquePhoneNumbers();

    @Query(value = "SELECT * FROM " + DataBaseDefines.Customer.TABLE_NAME + " WHERE "
            + DataBaseDefines.Customer.CUSTOMER_PHONE + " LIKE "
            + DataBaseDefines.PhoneNumberCode.UGANDA_CODE, nativeQuery = true)
    List<Customer> getAllUgandaPhoneNumbers();
}

