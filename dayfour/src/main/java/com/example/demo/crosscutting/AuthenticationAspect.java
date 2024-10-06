package com.example.demo.crosscutting;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Autowired
    private HttpServletRequest request;

    //This method will run before any method in UserController
    // can be done with custom annotation like below

    @Before("execution(* com.example.demo.controller.UserController.*(..))")
    //@Before("annotation(Authenticated)")
    public void authenticate(JoinPoint joinPoint) throws Throwable {
        String authHeader = request.getHeader("Authorization");

        if(authHeader == null || !authHeader.equals("valid-token")) {
         throw new SecurityException("User is not authenticated.");
        }

        System.out.println("Authentication successful for: " + joinPoint.getSignature());
    }
}
