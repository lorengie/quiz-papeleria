package com.example.Quiz_Papeleria.service;

import com.example.Quiz_Papeleria.model.Venta;
import com.example.Quiz_Papeleria.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository repo;

    public List<Venta> obtenerTodos() {
        return repo.findAll();
    }

    public Optional<Venta> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public List<Venta> obtenerVentasPorEmpleadoConCliente(Long idEmpleado) {
        return repo.findVentasByEmpleadoConCliente(idEmpleado);
    }

    public List<Venta> obtenerVentasPorEmpleadoYFecha(Long idEmpleado, LocalDate inicio, LocalDate fin) {
        return repo.findVentasByEmpleadoAndFechaBetween(idEmpleado, inicio, fin);
    }

    public Venta guardar(Venta v) {
        return repo.save(v);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
