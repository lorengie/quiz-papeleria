package com.example.Quiz_Papeleria.service;

import com.example.Quiz_Papeleria.model.Producto;
import com.example.Quiz_Papeleria.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repo;

    public List<Producto> obtenerTodos() {
        return repo.findAll();
    }

    public Optional<Producto> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public List<Producto> obtenerProductosPorProveedor(Long idProveedor) {
        return repo.findProductosByProveedor(idProveedor);
    }

    public Producto guardar(Producto p) {
        return repo.save(p);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}

