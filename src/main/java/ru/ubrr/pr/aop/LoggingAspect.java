package ru.ubrr.pr.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* ru.ubrr.pr.aop.ServiceDemoForAOP.*(..))")
    public void beforeAdvice() {
        System.out.println("Before executing the method...");
    }

    @AfterReturning(
            pointcut = "execution(* ru.ubrr.pr.aop.ServiceDemoForAOP.*(..))",
            returning = "result")
    public void afterReturningAdvice(Object result) {
        System.out.println("After returning: " + result);
    }

    @AfterThrowing(
            pointcut = "execution(* ru.ubrr.pr.aop.ServiceDemoForAOP.*(..))",
            throwing = "exception")
    public void afterThrowingAdvice(Exception exception) {
        System.out.println("After throwing: " + exception.getMessage());
    }

    @After("execution(* ru.ubrr.pr.aop.ServiceDemoForAOP.*(..))")
    public void afterAdvice() {
        System.out.println("After executing the method...");
    }

    @Around("execution(* ru.ubrr.pr.aop.ServiceDemoForAOP.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method execution (around)...");

        Object result = null;
        try {
            result = joinPoint.proceed();
            System.out.println("After method execution (around)...");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            throw e;
        }

        return result + " + info from AOP";
    }
}
