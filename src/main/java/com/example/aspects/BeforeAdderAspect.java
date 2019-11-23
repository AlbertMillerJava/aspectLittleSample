package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdderAspect {
    Logger logger = LoggerFactory.getLogger(BeforeAdderAspect.class);

    public void beforeAdder(JoinPoint joinPoint){
        logger.info("arguments of add method was {}, {}",joinPoint.getArgs());
    }
}
