package com.uis.ejeMvc.service;

import com.uis.ejeMvc.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceInter {
    public List<Persona> listar();
    public Optional<Persona> listarId(int id);
    public int save(Persona persona);
    public void delete(int id);
}
