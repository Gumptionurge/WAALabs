package labs.waa.lab4.Aspect;

import jakarta.annotation.PostConstruct;
import labs.waa.lab4.Entity.DTO.LoggerDTO;
import labs.waa.lab4.Entity.Logger;
import labs.waa.lab4.Repository.LoggerRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Aspect
@Component
public class LoggerAspect {

    @Autowired
    private LoggerRepository loggerRepository;

    @Before("logMe()")
    public void logBefore(JoinPoint joinPoint) {
        // Extract information for logging
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        String principal = "USER1"; // You can get the principal from authentication if you have it

        // Log information
        System.out.println(currentDate + "********" + currentTime + "********" + principal + "********" + joinPoint.getSignature().getName());

        // Create a Logger object
        Logger logger = new Logger();
        logger.setDate(currentDate);
        logger.setTime(currentTime);
        logger.setPrincipal(principal);
        logger.setOperation(joinPoint.getSignature().getName()+" IN CLASS: "+joinPoint.getClass());

        // Save the Logger object to the database
        loggerRepository.save(logger);
    }

    @Pointcut("execution(public * labs.waa.lab4.*.*.*(..)) && !execution(public * labs.waa.lab4.Repository.LoggerRepository.save(..))")
    public void logMe() {
    }
}