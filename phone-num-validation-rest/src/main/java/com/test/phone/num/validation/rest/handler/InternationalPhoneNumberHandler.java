package com.test.phone.num.validation.rest.handler;

import com.test.phone.num.validation.common.handler.ApplicationHandler;
import com.test.phone.num.validation.common.logger.InternationalPhoneNumberValidationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author nour.ihab
 */
@Component
public class InternationalPhoneNumberHandler extends ApplicationHandler {

    @Override
    public void start(ContextRefreshedEvent start) {
        InternationalPhoneNumberValidationLogger.info("The Application is Started Successfully...");

    }

    @Override
    public void Shutdown(ContextClosedEvent close) {
        InternationalPhoneNumberValidationLogger.info("The Application is Shutting Down...");
    }

}
