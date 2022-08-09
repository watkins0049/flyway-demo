package com.lunch.and.learn.flyway.trainer.service;

import com.lunch.and.learn.flyway.trainer.controller.contract.PokemonResponse;
import com.lunch.and.learn.flyway.trainer.controller.contract.TrainerResponse;
import com.lunch.and.learn.flyway.trainer.infrastructure.PokemonRepository;
import com.lunch.and.learn.flyway.trainer.infrastructure.TrainerRepository;
import com.lunch.and.learn.flyway.trainer.infrastructure.entity.Pokemon;
import com.lunch.and.learn.flyway.trainer.infrastructure.entity.Trainer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TrainerService {

    private final TrainerRepository trainerRepository;
    private final PokemonRepository pokemonRepository;

    public List<TrainerResponse> getTrainers() {
        List<Trainer> allTrainers = trainerRepository.findAll();
        List<Pokemon> allPokemon = pokemonRepository.findAll();

        return allTrainers.stream()
                .map(t -> TrainerResponse.builder()
                        .id(t.getId())
                        .name(t.getName())
                        .pokemon(getTrainerPokemon(allPokemon, t.getId()))
                        .build())
                .collect(Collectors.toList());
    }

    private List<PokemonResponse> getTrainerPokemon(List<Pokemon> allPokemon, Integer trainerId) {
        return allPokemon.stream().filter(p -> p.isAssignedToTrainer(trainerId))
                .map(p -> PokemonResponse.builder()
                        .name(p.getName())
                        .type(p.getType())
                        .pokedexNumber(p.getPokedexNumber())
                        .build())
                .collect(Collectors.toList());
    }
}
