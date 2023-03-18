package com.example.mustafa.fullstackdemo.expection;

public class PasswordDoesNotExistException extends Exception{
    public PasswordDoesNotExistException(Long password){
        super("Password does not exist " + password);
}
}

