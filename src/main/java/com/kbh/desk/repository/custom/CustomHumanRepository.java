package com.kbh.desk.repository.custom;

import com.kbh.desk.domain.Human;

import java.util.List;

public interface CustomHumanRepository {
    List<Human> findBySearchCondition(String name);
}
