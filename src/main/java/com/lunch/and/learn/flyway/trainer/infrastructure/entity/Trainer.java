package com.lunch.and.learn.flyway.trainer.infrastructure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Trainer {
    @Id
    private Integer id;
    private String name;

    @OneToMany(targetEntity = TrainerPokemon.class, mappedBy = "trainerId", fetch = FetchType.EAGER)
    private List<TrainerPokemon> trainerPokemon;
}
