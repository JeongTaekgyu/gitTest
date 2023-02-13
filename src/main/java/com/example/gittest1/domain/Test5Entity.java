package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test5Entity {
    @Id
    @GeneratedValue
    private Long id;
    private String test5name;
    private Integer num;
}
