package org.example.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* org.example.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Hahah, I intercepted your method");
        logger.info("Executing the method named " + joinPoint.getSignature().getName());
        Object[] arguments = joinPoint.getArgs();
        logger.info("The method arguments were " +
                    Arrays.asList(arguments));
        Object returnValue = joinPoint.proceed();
        logger.info("Nice job doing your work!");
        return returnValue;
    }

}
