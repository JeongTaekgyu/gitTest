package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Branch1Entity {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String address;
    private Integer number;
}
