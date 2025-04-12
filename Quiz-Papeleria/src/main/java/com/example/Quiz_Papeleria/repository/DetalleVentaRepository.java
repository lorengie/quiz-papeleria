package com.example.Quiz_Papeleria.repository;

import com.example.Quiz_Papeleria.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {

    @Query("SELECT d FROM DetalleVenta d JOIN d.venta v JOIN v.cliente c")
    List<DetalleVenta> findDetallesConClientes();
}
