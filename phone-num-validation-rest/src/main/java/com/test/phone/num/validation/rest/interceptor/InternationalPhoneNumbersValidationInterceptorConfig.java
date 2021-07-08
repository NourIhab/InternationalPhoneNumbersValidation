package com.test.phone.num.validation.rest.interceptor;

import com.test.phone.num.validation.rest.interceptor.InternationalPhoneNumbersValidationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author nour.ihab
 */
@Component
@Configuration
public class InternationalPhoneNumbersValidationInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    InternationalPhoneNumbersValidationInterceptor internationalPhoneNumbersValidationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(internationalPhoneNumbersValidationInterceptor);

    }

}
