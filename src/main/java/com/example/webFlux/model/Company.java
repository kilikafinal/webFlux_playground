package com.example.webFlux.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document
public class Company {

    @Id
    private int id;
    private List<Employee> employees;
    private String address;
    private String ownerFirstName;

    public Company(int id,
                   List<Employee> employees,
                   String address,
                   String ownerFirstName) {
        this.id = id;
        this.employees = employees;
        this.address = address;
        this.ownerFirstName = ownerFirstName;
    }
}
