package com.airbnb.bnb.controller;

import com.airbnb.bnb.AuthDto.AuthDto;
import com.airbnb.bnb.services.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
@PostMapping("/ap")
    public ResponseEntity<AuthDto>createuser(@RequestBody AuthDto dto){
        AuthDto loginuser =authService.createuser(dto);
        return new ResponseEntity<>(loginuser, HttpStatus.CREATED);
    }

}
