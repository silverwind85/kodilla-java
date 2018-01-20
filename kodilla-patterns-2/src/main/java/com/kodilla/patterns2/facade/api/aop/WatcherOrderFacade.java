package com.kodilla.patterns2.facade.api.aop;

import com.kodilla.patterns2.facade.api.OrderFacade;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WatcherOrderFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent(){
        LOGGER.info("Logging the event");

    }
}
