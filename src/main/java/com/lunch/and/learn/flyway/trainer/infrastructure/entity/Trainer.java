package com.lunch.and.learn.flyway.trainer.infrastructure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Trainer {
    @Id
    private Integer id;
    private String name;
}
