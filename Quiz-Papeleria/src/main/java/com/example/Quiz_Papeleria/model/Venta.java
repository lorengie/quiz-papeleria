package com.example.Quiz_Papeleria.model;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_venta;

    private LocalTime fecha;
    private int id_cliente;
    private int id_empleado;

    @ManyToOne

    public long getId_venta() {
        return id_venta;
    }

    public void setId_venta(long id_venta) {
        this.id_venta = id_venta;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
}
