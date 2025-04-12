package com.example.Quiz_Papeleria.service;

import com.example.Quiz_Papeleria.model.Empleado;
import com.example.Quiz_Papeleria.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository repo;
    public List<Empleado> obtenerTodos() { return repo.findAll(); }
    public Optional<Empleado> obtenerPorId(Long id) { return repo.findById(id); }
    public Empleado guardar(Empleado e) { return repo.save(e); }
    public void eliminar(Long id) { repo.deleteById(id); }
}