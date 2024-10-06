package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SecurityException.class)
    public ResponseEntity<String> handleAuthenticationException(SecurityException ex) {
        return new ResponseEntity<>("Authentication Failed: " + ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
