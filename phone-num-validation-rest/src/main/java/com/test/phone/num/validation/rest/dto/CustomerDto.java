package com.test.phone.num.validation.rest.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author nour.ihab
 */
@Getter
@Setter
@ToString
public class CustomerDto implements Serializable {

    private Long customerId;
    private String customerName;
    private String customerPhone;
    private String country;
}
