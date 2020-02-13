package com.example.webFlux.repositories;

import com.example.webFlux.model.Company;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CompanyRepository extends ReactiveMongoRepository<Company, Integer> {
    @Query("{'name': ?0}")
    Flux<Company> findByName(final String name);
}
