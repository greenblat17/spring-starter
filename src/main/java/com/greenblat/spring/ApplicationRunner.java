package com.greenblat.spring;

import com.greenblat.spring.database.pool.ConnectionPool;
import com.greenblat.spring.database.repository.CompanyRepository;
import com.greenblat.spring.database.repository.UserRepository;
import com.greenblat.spring.ioc.Container;
import com.greenblat.spring.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {
        var container = new Container();
//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

        var userService = container.getClass(UserService.class);
    }
}
