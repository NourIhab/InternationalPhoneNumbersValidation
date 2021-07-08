package com.test.phone.num.validation.common.handler;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 *
 * @author nour.ihab
 */
public abstract class ApplicationHandler {

    @EventListener
    public abstract void start(ContextRefreshedEvent start);

    @EventListener
    public abstract void Shutdown(ContextClosedEvent close);
}
