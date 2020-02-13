package com.example.webFlux.services;

import com.example.webFlux.model.Company;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CompanyService {
    void create(Company c);

    Mono<Company> findById(Integer id);

    Flux<Company> findByName(String name);

    Flux<Company> findAll();

    Mono<Company> update(Company c);

    Mono<Void> delete(Integer id);
}
