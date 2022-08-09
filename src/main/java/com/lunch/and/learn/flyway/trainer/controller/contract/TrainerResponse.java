package com.lunch.and.learn.flyway.trainer.controller.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TrainerResponse {
    private Integer id;
    private String name;
    private List<PokemonResponse> pokemon;
}
