package com.greenblat.spring.service;

import com.greenblat.spring.database.repository.CompanyRepository;
import com.greenblat.spring.database.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    private CompanyService companyService;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }

    // зацикливание
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }
}
