package com.example.caseStudy.common;

import com.example.caseStudy.dto.APIResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequestScope
@RequiredArgsConstructor
public class APIResponse {

    private String text;

    public APIResponseDTO createServiceResult(){

        return new APIResponseDTO(text);
    }

    public void addInformationMessage(String messages){
        text=messages;
    }

    public void addErrorMessage(String messages){
        text="ERROR : " + messages;
    }

}
