package com.example.Quiz_Papeleria.controller;

import com.example.Quiz_Papeleria.model.Producto;
import com.example.Quiz_Papeleria.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @GetMapping
    public List<Producto> listar() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> get(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @GetMapping("/proveedor/{idProveedor}")
    public List<Producto> obtenerProductosPorProveedor(@PathVariable Long idProveedor) {
        return service.obtenerProductosPorProveedor(idProveedor);
    }

    @PostMapping
    public Producto crear(@RequestBody Producto p) {
        return service.guardar(p);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto p) {
        p.setId_producto(id);
        return service.guardar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
