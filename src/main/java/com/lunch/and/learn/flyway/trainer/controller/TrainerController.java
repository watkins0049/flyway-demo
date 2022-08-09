package com.lunch.and.learn.flyway.trainer.controller;

import com.lunch.and.learn.flyway.trainer.controller.contract.TrainerResponse;
import com.lunch.and.learn.flyway.trainer.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TrainerController {

    private final TrainerService service;

    @GetMapping
    public List<TrainerResponse> getTrainers() {
        return service.getTrainers();
    }

}
