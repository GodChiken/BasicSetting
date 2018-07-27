package com.kbh.desk.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(exclude = {"slipList", "selectedInputCheckKeyList"})
@ToString(exclude = {"slipList", "selectedInputCheckKeyList"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "managerIdx")
public class TestDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_idx")
    private int managerIdx;

    private String id;
    private String password = "1234";
    private String authenticationCode;
    private boolean isEnabled;
    private int lastSelectBookFinancialPeriodIdx;
}