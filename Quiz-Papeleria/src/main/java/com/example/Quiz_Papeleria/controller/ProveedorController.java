package com.example.Quiz_Papeleria.controller;

import com.example.Quiz_Papeleria.model.Proveedor;
import com.example.Quiz_Papeleria.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService service;

    @GetMapping
    public List<Proveedor> listar() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> get(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Proveedor crear(@RequestBody Proveedor p) {
        return service.guardar(p);
    }

    @PutMapping("/{id}")
    public Proveedor actualizar(@PathVariable Long id, @RequestBody Proveedor p) {
        p.setId_proveedor(id);
        return service.guardar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
