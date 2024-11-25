package com.airbnb.bnb.controller;

import com.airbnb.bnb.AuthDto.AuthDto;
import com.airbnb.bnb.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Auth/V1/login")
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    public ResponseEntity<AuthDto>userlogin(@RequestBody AuthDto dto){
        AuthService.loginuser(dto);
        return new ResponseEntity<>();
    }

}
