package com.educandoweb.course.resourses.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educandoweb.course.services.exceptions.DatabaseException;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler { // Manipulador de exceções de recursos


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Recurso não encontrado";
        Integer status = HttpStatus.NOT_FOUND.value();
        StandardError err = new StandardError(Instant.now(), status, error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request){
        String error = "Erro no banco de dados";
        Integer status = HttpStatus.BAD_REQUEST.value();
        StandardError err = new StandardError(Instant.now(), status, error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }


}
