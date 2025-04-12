package com.example.Quiz_Papeleria.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_empleado;

    private String nombre;
    private String cargo;
    private String telefono;

    @OneToMany(mappedBy = "empleado")
    private List<Venta> ventas;

    public long getId_empleado() { return id_empleado; }
    public void setId_empleado(long id_empleado) { this.id_empleado = id_empleado; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public List<Venta> getVentas() { return ventas; }
    public void setVentas(List<Venta> ventas) { this.ventas = ventas; }
}
