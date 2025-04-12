package com.example.Quiz_Papeleria.service;

import com.example.Quiz_Papeleria.model.DetalleVenta;
import com.example.Quiz_Papeleria.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    public List<DetalleVenta> obtenerTodos() {
        return detalleVentaRepository.findAll();
    }

    public Optional<DetalleVenta> obtenerPorId(Long id) {
        return detalleVentaRepository.findById(id);
    }

    public List<DetalleVenta> obtenerDetallesConClientes() {
        return detalleVentaRepository.findDetallesConClientes();
    }

    public DetalleVenta guardar(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    public void eliminar(Long id) {
        detalleVentaRepository.deleteById(id);
    }
}