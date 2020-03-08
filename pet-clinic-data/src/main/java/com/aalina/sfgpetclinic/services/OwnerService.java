package com.aalina.sfgpetclinic.services;

import com.aalina.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
