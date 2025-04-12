package com.example.Quiz_Papeleria.repository;

import com.example.Quiz_Papeleria.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query("SELECT p FROM Producto p WHERE p.proveedor.id_proveedor = :idProveedor")
    List<Producto> findProductosByProveedor(@Param("idProveedor") Long idProveedor);

}
