package com.lunch.and.learn.flyway.trainer.service;

import com.lunch.and.learn.flyway.trainer.controller.contract.PokemonResponse;
import com.lunch.and.learn.flyway.trainer.controller.contract.TrainerResponse;
import com.lunch.and.learn.flyway.trainer.infrastructure.PokemonRepository;
import com.lunch.and.learn.flyway.trainer.infrastructure.TrainerRepository;
import com.lunch.and.learn.flyway.trainer.infrastructure.entity.Pokemon;
import com.lunch.and.learn.flyway.trainer.infrastructure.entity.Trainer;
import com.lunch.and.learn.flyway.trainer.infrastructure.entity.TrainerPokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TrainerService {

    private final TrainerRepository trainerRepository;

    public List<TrainerResponse> getTrainers() {
        List<Trainer> allTrainers = trainerRepository.findAll();

        return allTrainers.stream()
                .map(t -> TrainerResponse.builder()
                        .id(t.getId())
                        .name(t.getName())
                        .pokemon(mapPokemon(t.getTrainerPokemon()))
                        .build())
                .collect(Collectors.toList());
    }

    private List<PokemonResponse> mapPokemon(List<TrainerPokemon> trainerPokemon) {
        return trainerPokemon.stream().map(tp -> {
            Pokemon p = tp.getPokemon();
                    return PokemonResponse.builder()
                            .pokedexNumber(p.getPokedexNumber())
                            .type(p.getType())
                            .name(p.getName())
                            .build();
                }
        ).collect(Collectors.toList());
    }
}
