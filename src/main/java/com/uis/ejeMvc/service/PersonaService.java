package com.uis.ejeMvc.service;

import com.uis.ejeMvc.model.Persona;
import com.uis.ejeMvc.reporitory.PersonaRepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaService implements PersonaServiceInter {
    @Autowired
    private PersonaRepositoryInter personaRepositoryInter;


    @Override
    public List<Persona> listar() {
        return (List<Persona>) personaRepositoryInter.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona persona) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
