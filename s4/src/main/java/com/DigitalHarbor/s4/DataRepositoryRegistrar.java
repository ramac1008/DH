package com.DigitalHarbor.s4;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DataRepositoryRegistrar extends CrudRepository<Registrar, Long> {

}

