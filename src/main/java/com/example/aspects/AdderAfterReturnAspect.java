package com.example.aspects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdderAfterReturnAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public void afterReturn(Object returnValue) {
        logger.info("return value was {}", returnValue);
    }
}
