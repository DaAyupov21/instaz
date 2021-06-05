package ru.damayupov.instaz.payload.response;

import lombok.Getter;

@Getter
public class InvalidLoginResponse {
    private String username;
    private String password;

    public InvalidLoginResponse(){
        this.password = "Invalid password";
        this.username = "Invalid username";
    }
}
