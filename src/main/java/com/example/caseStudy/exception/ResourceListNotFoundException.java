package com.example.caseStudy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.stream.Collectors;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceListNotFoundException extends RuntimeException{

    private String resourceName;
    private String fieldName;
    private List<Long> fieldValue;

    public ResourceListNotFoundException(String resourceName, String fieldName, List<Long> fieldValue){

        super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining("-", "{", "}"))  ));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
