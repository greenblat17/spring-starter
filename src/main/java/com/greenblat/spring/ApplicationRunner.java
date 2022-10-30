package com.greenblat.spring;

import com.greenblat.spring.database.pool.ConnectionPool;
import com.greenblat.spring.database.repository.CompanyRepository;
import com.greenblat.spring.database.repository.UserRepository;
import com.greenblat.spring.ioc.Container;
import com.greenblat.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        // clazz -> String -> Map<String, Object>
        var connectionPool = context.getBean("pool2", ConnectionPool.class);
        System.out.println(connectionPool);
    }
}
