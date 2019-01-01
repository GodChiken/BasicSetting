package com.kbh.desk.repository.custom.impl;

import com.kbh.desk.domain.Human;
import com.kbh.desk.repository.custom.CustomHumanRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;

public class HumanRepositoryImpl extends QueryDslRepositorySupport implements CustomHumanRepository{
    public HumanRepositoryImpl() {
        super(Human.class);
    }

    @Override
    public List<Human> findByName(String name) {
        return null;
    }
}
