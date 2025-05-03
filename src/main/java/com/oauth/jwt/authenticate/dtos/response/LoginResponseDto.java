package com.oauth.jwt.authenticate.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
    private String token;

    private long expiresIn;
}
