package com.test.phone.num.validation.rest.interceptor;


import com.test.phone.num.validation.common.logger.InternationalPhoneNumberValidationLogger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author nour.ihab
 */
@Component
public class InternationalPhoneNumbersValidationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        InternationalPhoneNumberValidationLogger.info("Pre Handle method is Calling");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        InternationalPhoneNumberValidationLogger.info("Post Handle method is Calling");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {

        InternationalPhoneNumberValidationLogger.info("Request and Response is completed");
    }

}
