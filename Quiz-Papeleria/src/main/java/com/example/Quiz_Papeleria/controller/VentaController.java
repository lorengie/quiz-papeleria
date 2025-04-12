package com.example.Quiz_Papeleria.controller;

import com.example.Quiz_Papeleria.model.Venta;
import com.example.Quiz_Papeleria.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaService service;

    @GetMapping
    public List<Venta> listar() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Venta> get(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @GetMapping("/empleado/{idEmpleado}/clientes")
    public List<Venta> obtenerVentasPorEmpleadoConCliente(@PathVariable Long idEmpleado) {
        return service.obtenerVentasPorEmpleadoConCliente(idEmpleado);
    }

    @GetMapping("/empleado/{idEmpleado}/fecha")
    public List<Venta> obtenerVentasPorEmpleadoYFecha(
            @PathVariable Long idEmpleado,
            @RequestParam LocalDate inicio,
            @RequestParam LocalDate fin
    ) {
        return service.obtenerVentasPorEmpleadoYFecha(idEmpleado, inicio, fin);
    }

    @PostMapping
    public Venta crear(@RequestBody Venta v) {
        return service.guardar(v);
    }

    @PutMapping("/{id}")
    public Venta actualizar(@PathVariable Long id, @RequestBody Venta v) {
        v.setId_venta(id);
        return service.guardar(v);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}

