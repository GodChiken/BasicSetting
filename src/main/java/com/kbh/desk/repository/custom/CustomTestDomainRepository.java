package com.kbh.desk.repository.custom;

import com.kbh.desk.domain.TestDomain;

import java.util.List;

public interface CustomTestDomainRepository {
    List<TestDomain> findById(String id);
}
