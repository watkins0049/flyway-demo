package com.lunch.and.learn.flyway.trainer.infrastructure;

import com.lunch.and.learn.flyway.trainer.infrastructure.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
}
