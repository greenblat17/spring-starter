package com.greenblat.spring.database.repository;

import com.greenblat.spring.bpp.Auditing;
import com.greenblat.spring.bpp.InjectBean;
import com.greenblat.spring.bpp.Transaction;
import com.greenblat.spring.database.entity.Company;
import com.greenblat.spring.database.pool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @InjectBean
    private  ConnectionPool connectionPool;

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }


    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById() method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {

    }
}
