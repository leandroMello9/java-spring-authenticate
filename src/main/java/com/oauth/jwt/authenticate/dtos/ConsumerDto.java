package com.oauth.jwt.authenticate.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsumerDto {
    private String email;
    private String password;
    private String fullName;
}
