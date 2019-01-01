package com.kbh.desk.repository.standard;

import com.kbh.desk.domain.Human;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanRepository extends JpaRepository<Human, Integer> {
}
