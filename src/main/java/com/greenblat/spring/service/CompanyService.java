package com.greenblat.spring.service;

public class CompanyService {

    private UserService userService;

    // зацикливание
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
