package com.lunch.and.learn.flyway.trainer.infrastructure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

@Data
@Entity
public class Pokemon {
    @Id
    private Integer pokedexNumber;
    private String name;
    private String type;
    private Integer hp;
    private Integer attack;
    private Integer defense;
    private Integer specialAttack;
    private Integer specialDefense;
    private Integer speed;
    private String trainers;

    public Boolean isAssignedToTrainer(Integer trainerId) {
        return trainers != null && Arrays.asList(trainers.split(",")).contains(trainerId.toString());
    }
}
