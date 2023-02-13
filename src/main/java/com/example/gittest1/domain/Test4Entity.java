package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test4Entity {
    @Id @GeneratedValue
    private Long id;
    private String test4name;
    private Integer num;
}
