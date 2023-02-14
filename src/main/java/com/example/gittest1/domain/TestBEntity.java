package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestBEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer num;
}
