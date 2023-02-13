package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test2Entity {
    @Id @GeneratedValue
    private Long id;
    private String test2name;
    private Integer num;

}
