package at.hochbichler.sfgpetclinic.services;

import at.hochbichler.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
