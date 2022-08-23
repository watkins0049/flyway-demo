package com.lunch.and.learn.flyway.trainer.infrastructure.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TrainerPokemon {
    @Id
    private Integer serialNumber;
    private Integer trainerId;
    private Integer pokedexNumber;

    @ManyToOne(targetEntity = Pokemon.class, fetch = FetchType.EAGER)
    @JoinColumn(name="pokedexNumber", insertable = false, updatable = false)
    private Pokemon pokemon;
}
