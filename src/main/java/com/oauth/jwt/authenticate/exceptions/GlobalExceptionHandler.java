package com.oauth.jwt.authenticate.exceptions;

import java.nio.file.AccessDeniedException;
import java.security.SignatureException;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.security.authentication.AccountStatusException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.jsonwebtoken.ExpiredJwtException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    
    @ExceptionHandler(BadCredentialsException.class)
    public ProblemDetail badCredentials(BadCredentialsException badCredentialsException) {
            ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(401), badCredentialsException.getMessage());
            problemDetail.setProperty("description", "The username or password is incorrect");
            return problemDetail;
    }
    @ExceptionHandler(AccountStatusException.class)
    public ProblemDetail accountStatusException(AccountStatusException accountStatusException) {
            ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(401), accountStatusException.getMessage());
            problemDetail.setProperty("description", "The username or password is incorrect");
            return problemDetail;
    }
    @ExceptionHandler(AccessDeniedException.class)
    public ProblemDetail accessDeniedException(AccessDeniedException accessDeniedException) {
            ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(401), accessDeniedException.getMessage());
            problemDetail.setProperty("description", "The username or password is incorrect");
            return problemDetail;
    }
    @ExceptionHandler(SignatureException.class)
    public ProblemDetail signatureException(SignatureException signatureException) {
            ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(401), signatureException.getMessage());
            problemDetail.setProperty("description", "The username or password is incorrect");
            return problemDetail;
    }

    @ExceptionHandler(ExpiredJwtException.class)
    public ProblemDetail expiredJwtException(ExpiredJwtException expiredJwtException) {
            ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(401), expiredJwtException.getMessage());
            problemDetail.setProperty("description", "The username or password is incorrect");
            return problemDetail;
    }
    
}
