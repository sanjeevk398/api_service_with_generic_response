package com.example.create.endpoints.dtos;

import lombok.Data;

import java.util.List;

@Data
public class GenericResponse<T> {
    private String message;
    private Integer statusCode;
    private T data;
    private List<?> dataList;
    private List<String> errorCodes;
}
