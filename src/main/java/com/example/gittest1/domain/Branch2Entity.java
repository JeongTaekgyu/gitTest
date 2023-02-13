package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Branch2Entity {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String address;
}
