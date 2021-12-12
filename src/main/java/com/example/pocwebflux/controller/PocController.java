package com.example.pocwebflux.controller;

import com.example.pocwebflux.domain.entity.Poc;
import com.example.pocwebflux.service.PocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class PocController {

    private final PocService pocService;

    @GetMapping
    public Flux<Poc> listAll() {
        return pocService.listAll();
    }

    @GetMapping(path = "{id}")
    public Mono<Poc> findById(@PathVariable int id) {
        return pocService.findById(id);
    }
}
