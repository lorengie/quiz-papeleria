package com.example.Quiz_Papeleria.service;

import com.example.Quiz_Papeleria.model.Proveedor;
import com.example.Quiz_Papeleria.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository repo;
    public List<Proveedor> obtenerTodos() { return repo.findAll(); }
    public Optional<Proveedor> obtenerPorId(Long id) { return repo.findById(id); }
    public Proveedor guardar(Proveedor p) { return repo.save(p); }
    public void eliminar(Long id) { repo.deleteById(id); }
}
