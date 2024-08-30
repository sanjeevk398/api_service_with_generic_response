package com.example.create.endpoints.controllers;

import com.example.create.endpoints.dtos.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppErrorController {

    @ExceptionHandler(value = { RuntimeException.class, Exception.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<GenericResponse> error(){
        GenericResponse response = new GenericResponse<>();
        response.setMessage("ERROR");
        response.setStatusCode(-1);
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }
}
