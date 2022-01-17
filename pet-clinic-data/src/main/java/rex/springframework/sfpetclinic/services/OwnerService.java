package rex.springframework.sfpetclinic.services;

import rex.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
