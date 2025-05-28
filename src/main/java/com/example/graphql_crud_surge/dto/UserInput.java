package com.example.graphql_crud_surge.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInput {
    private String name;
    private String email;
    private Integer age;
}
