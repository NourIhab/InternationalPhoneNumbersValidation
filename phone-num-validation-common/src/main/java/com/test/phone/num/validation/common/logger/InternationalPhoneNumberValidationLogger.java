package com.test.phone.num.validation.common.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author nour.ihab
 */
public class InternationalPhoneNumberValidationLogger {

    private static Logger infoLogger = LogManager.getLogger("infoLogger");
    private static Logger errorLogger = LogManager.getLogger("errorLogger");

    public static void error(String msg, Throwable... e) {
        msg = format(msg);
        errorLogger.error(msg, e);
    }

    public static void info(String msg) {
        infoLogger.info(format(msg));
    }

    private static String format(String msg) {
        StringBuilder formattedMsg = new StringBuilder();
        StackTraceElement ste = getCallerFromStack();
        formattedMsg.append("[")
                .append(ste.getClassName().substring(ste.getClassName().lastIndexOf(".") + 1))
                .append(".")
                .append(ste.getMethodName())
                .append("] ")
                .append(msg);
        return formattedMsg.toString();
    }

    private static StackTraceElement getCallerFromStack() {
        return Thread.currentThread().getStackTrace()[4];
    }
}
