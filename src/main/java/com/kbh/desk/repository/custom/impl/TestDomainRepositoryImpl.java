package com.kbh.desk.repository.custom.impl;

import com.kbh.desk.domain.TestDomain;
import com.kbh.desk.repository.custom.CustomTestDomainRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;

public class TestDomainRepositoryImpl extends QueryDslRepositorySupport implements CustomTestDomainRepository{
    public TestDomainRepositoryImpl() {
        super(TestDomain.class);
    }

    @Override
    public List<TestDomain> findById(String id) {
        return null;
    }
}
