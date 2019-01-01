package com.kbh.desk.repository.standard;

import com.kbh.desk.domain.TestDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDomainRepository extends JpaRepository<TestDomain, Integer> {
}
