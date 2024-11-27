package com.airbnb.bnb.AuthDto;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthDto {
    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;


}







