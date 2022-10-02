package com.springbook.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class ProjectAspect {

    private final Logger logger = Logger.getLogger(ProjectAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        Object returnValue = joinPoint.proceed();
        logger.info("Watching from inside the method xD!");
        return returnValue;
    }
}
