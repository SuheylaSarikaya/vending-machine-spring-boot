package com.example.caseStudy.exception;

import com.example.caseStudy.entities.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private List<Product> fieldValue;

    public ProductNotFoundException(String resourceName, String fieldName, List<Product> fieldValue){

        super(String.format("%s not found %s ", resourceName, fieldName));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
