package com.example.Quiz_Papeleria.controller;

import com.example.Quiz_Papeleria.model.DetalleVenta;
import com.example.Quiz_Papeleria.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detalles")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping
    public List<DetalleVenta> listarDetalles() {
        return detalleVentaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<DetalleVenta> obtenerDetallePorId(@PathVariable Long id) {
        return detalleVentaService.obtenerPorId(id);
    }

    @GetMapping("/con-clientes")
    public List<DetalleVenta> obtenerDetallesConClientes() {
        return detalleVentaService.obtenerDetallesConClientes();
    }

    @PostMapping
    public DetalleVenta crearDetalle(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.guardar(detalleVenta);
    }

    @PutMapping("/{id}")
    public DetalleVenta actualizarDetalle(@PathVariable Long id, @RequestBody DetalleVenta detalleActualizado) {
        detalleActualizado.setId_detalle(id);
        return detalleVentaService.guardar(detalleActualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminarDetalle(@PathVariable Long id) {
        detalleVentaService.eliminar(id);
    }
}
