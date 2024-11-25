package com.airbnb.bnb.services;

import com.airbnb.bnb.AuthDto.AuthDto;
import com.airbnb.bnb.Repository.AppuserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private AppuserRepository appuserRepository;

    public AuthService(AppuserRepository appuserRepository) {
        this.appuserRepository = appuserRepository;
    }

    public AuthDto loginuser(AuthDto dto) {


        return
    }
}
