package com.example.webFlux.services;

import com.example.webFlux.model.Company;
import com.example.webFlux.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public void create(Company c) {
        companyRepository.save(c);
    }

    @Override
    public Mono<Company> findById(Integer id) {
        return companyRepository.findById(id);
    }

    @Override
    public Flux<Company> findByName(String name) {
        return companyRepository.findByName(name);
    }

    @Override
    public Flux<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Mono<Company> update(Company c) {
        return companyRepository.save(c);
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return companyRepository.deleteById(id);
    }
}
