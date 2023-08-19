package com.example.caseStudy.dto;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProductDTO {
    @NotNull
    private Long id;
    @NotNull
    private int count;
    @NotNull
    private String name;
    @NotNull
    private String img;
    @NotNull
    private Double price;
    @NotNull
    private int temperature;

}
