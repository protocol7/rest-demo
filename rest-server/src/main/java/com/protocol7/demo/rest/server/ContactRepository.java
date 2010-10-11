package com.protocol7.demo.rest.server;

import org.springframework.stereotype.Repository;

import se.vgregion.core.domain.patterns.repository.inmemory.InMemoryRepository;


@Repository
public class ContactRepository extends InMemoryRepository<Contact, Long> {

    public ContactRepository() {
        store(new Contact(123, "Niklas", "Gustavsson", null, 35));
    }
}
