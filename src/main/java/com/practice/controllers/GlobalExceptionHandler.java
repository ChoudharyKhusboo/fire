package com.practice.controllers;

import com.practice.dtos.ErrorResponseDto;
import com.practice.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //TODO: Both the below methods have the same definition except that they handle two different exception type.
    // Can we not use one method to handle both?

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleUserNotFoundException(UserNotFoundException e){
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(e.getMessage());
        return new ResponseEntity<>(errorResponseDto, HttpStatus.NOT_FOUND);
    }

//
//    @ExceptionHandler(NoOrderFoundException.class)
//    public ResponseEntity<ErrorResponseDto> handleNoOrderFoundException(NoOrderFoundException e){
//        ErrorResponseDto errorResponseDto = new ErrorResponseDto(e.getMessage());
//        return new ResponseEntity<>(errorResponseDto, HttpStatus.NOT_FOUND);
//    }
}
