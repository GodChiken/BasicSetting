package com.kbh.desk.repository.standard;

import com.kbh.desk.domain.Human;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HumanRepository extends JpaRepository<Human, Integer> {
    List<Human> findAllByName(String name);
}
