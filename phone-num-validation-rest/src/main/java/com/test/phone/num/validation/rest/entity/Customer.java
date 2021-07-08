package com.test.phone.num.validation.rest.entity;

import com.test.phone.num.validation.common.defines.DataBaseDefines;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author nour.ihab
 */
@Entity
@Table(name = DataBaseDefines.Customer.TABLE_NAME)
@Getter
@Setter
@ToString
public class Customer implements Serializable {

    @Id
    @Column(name = DataBaseDefines.Customer.CUSTOMER_ID, nullable = false)
    private Long customerId;
    @Column(name = DataBaseDefines.Customer.CUSTOMER_NAME)
    private String customerName;
    @Column(name = DataBaseDefines.Customer.CUSTOMER_PHONE)
    private String customerPhone;
    @Column(name = DataBaseDefines.Customer.COUNRTY)
    private String country;

}
