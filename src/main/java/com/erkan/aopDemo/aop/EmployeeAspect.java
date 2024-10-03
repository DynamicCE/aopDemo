package com.erkan.aopDemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public
class EmployeeAspect {

    @Before ( value = "execution(* com.erkan.aopDemo.controller.EmployeeController.*(.. ))")
    public void beforeAdvice( JoinPoint joinPoint ){
        System.out.println("Request to"+ joinPoint.getSignature ()  +  "started at " + new Date() );
    }

    @After ( value = "execution(* com.erkan.aopDemo.controller.EmployeeController.*(..) )" )
    public void afterAdvice ( JoinPoint joinPoint ){
        System.out.println("Request to"+ joinPoint.getSignature ()  +  "ended at " + new Date() );
    }
}
