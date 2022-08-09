package com.lunch.and.learn.flyway.trainer.infrastructure;

import com.lunch.and.learn.flyway.trainer.infrastructure.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
}
