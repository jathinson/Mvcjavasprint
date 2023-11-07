package com.uis.ejeMvc.reporitory;

import com.uis.ejeMvc.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositoryInter extends CrudRepository<Persona, Integer> {
}
