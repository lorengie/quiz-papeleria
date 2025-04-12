package com.example.Quiz_Papeleria.controller;

import com.example.Quiz_Papeleria.model.Empleado;
import com.example.Quiz_Papeleria.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService service;

    @GetMapping
    public List<Empleado> listar() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Empleado> get(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Empleado crear(@RequestBody Empleado e) {
        return service.guardar(e);
    }

    @PutMapping("/{id}")
    public Empleado actualizar(@PathVariable Long id, @RequestBody Empleado e) {
        e.setId_empleado(id);
        return service.guardar(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
