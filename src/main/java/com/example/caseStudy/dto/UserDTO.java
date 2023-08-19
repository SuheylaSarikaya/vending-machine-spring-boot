package com.example.caseStudy.dto;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;


@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserDTO {

    @NotNull
    private String username;
    @NotNull
    private String password;
}
