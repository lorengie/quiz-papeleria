package com.example.Quiz_Papeleria.repository;

import com.example.Quiz_Papeleria.model.DetalleVenta;
import com.example.Quiz_Papeleria.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface VentaRepository extends JpaRepository<Venta,Long> {
    @Query("SELECT v FROM Venta v JOIN v.cliente c WHERE v.empleado.id_empleado = :idEmpleado")
    List<Venta> findVentasByEmpleadoConCliente(@Param("idEmpleado") Long idEmpleado);

    @Query("SELECT v FROM Venta v WHERE v.empleado.id_empleado = :idEmpleado AND v.fecha BETWEEN :inicio AND :fin")
    List<Venta> findVentasByEmpleadoAndFechaBetween(
            @Param("idEmpleado") Long idEmpleado,
            @Param("inicio") LocalDate inicio,
            @Param("fin") LocalDate fin
    );
}
