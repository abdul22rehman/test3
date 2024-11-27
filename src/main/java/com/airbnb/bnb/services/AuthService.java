package com.airbnb.bnb.services;

import com.airbnb.bnb.AuthDto.AuthDto;

import com.airbnb.bnb.Repository.AppuserRepository;
import com.airbnb.bnb.entity.Appuser;
import com.airbnb.bnb.exception.Userexist;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private AppuserRepository appuserRepository;
private ModelMapper modelMapper;
    public AuthService(AppuserRepository appuserRepository, ModelMapper modelMapper) {
        this.appuserRepository = appuserRepository;
        this.modelMapper = modelMapper;
    }


    public AuthDto createuser(AuthDto dto) {
        Appuser appuser = maptoEntity(dto);
        Optional<Appuser> byEmail = appuserRepository.findByEmail(appuser.getEmail());
        if (byEmail.isPresent()) {
            throw new Userexist("Email already exists");
        }


        Optional<Appuser> byUsername = appuserRepository.findByUsername(appuser.getUsername());
        if (byUsername.isPresent()) {
            throw new Userexist("Username already exists");
        }


        Appuser save = appuserRepository.save(appuser);
        AuthDto maptodto = maptodto(save);
        return maptodto;
    }

   Appuser maptoEntity(AuthDto dto){
       Appuser entity = modelMapper.map(dto, Appuser.class);
       return entity;

   }
   AuthDto maptodto(Appuser app){
       AuthDto dto = modelMapper.map(app, AuthDto.class);
       return dto;

    }


}
