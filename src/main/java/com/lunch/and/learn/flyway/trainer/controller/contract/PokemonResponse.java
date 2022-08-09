package com.lunch.and.learn.flyway.trainer.controller.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PokemonResponse {
    private Integer pokedexNumber;
    private String name;
    private String type;
}
