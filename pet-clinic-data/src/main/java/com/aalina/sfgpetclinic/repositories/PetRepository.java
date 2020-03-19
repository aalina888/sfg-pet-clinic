package com.aalina.sfgpetclinic.repositories;

import com.aalina.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
