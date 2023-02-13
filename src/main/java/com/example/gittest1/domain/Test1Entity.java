package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test1Entity {
    @Id @GeneratedValue
    private Long id;
    private String test1name;
    private Integer num;
}
