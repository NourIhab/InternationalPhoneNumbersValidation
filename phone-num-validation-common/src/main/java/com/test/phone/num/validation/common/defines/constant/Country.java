package com.test.phone.num.validation.common.defines.constant;

/**
 *
 * @author nour.ihab
 */
public enum Country {
    CAMEROON("CAMEROON"), ETHIOPIA("ETHIOPIA"), MORCCO("MORCCO"), MOZAMBIQUE("MOZAMBIQUE"), UGANDA("UGANDA"),SELECT_YOUR_COUNTRY("Select Your Country");

    private final String value;

    private Country(String value) {
        this.value = value;
    }

    public String getVlue() {
        return value;
    }

}
