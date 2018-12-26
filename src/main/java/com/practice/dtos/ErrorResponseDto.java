package com.practice.dtos;

import lombok.Data;

@Data
public class ErrorResponseDto {
    private String message;

    public ErrorResponseDto(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
