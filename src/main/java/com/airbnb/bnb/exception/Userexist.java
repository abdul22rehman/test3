package com.airbnb.bnb.exception;

public class Userexist extends RuntimeException{
    public Userexist(String message) {
        super(message);
    }
}
