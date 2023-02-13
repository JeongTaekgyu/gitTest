package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test3Entity {
    @Id @GeneratedValue
    private Long id;
    private String test3name;
    private Integer num;
}
