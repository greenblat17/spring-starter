package com.greenblat.spring.service;

import com.greenblat.spring.database.entity.Company;
import com.greenblat.spring.database.repository.CompanyRepository;
import com.greenblat.spring.database.repository.CrudRepository;
import com.greenblat.spring.database.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }

}
