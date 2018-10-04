package at.hochbichler.sfgpetclinic.services;

import at.hochbichler.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet findByLastName(String lastName);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
