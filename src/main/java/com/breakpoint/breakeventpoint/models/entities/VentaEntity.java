package com.breakpoint.breakeventpoint.models.entities;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class VentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    @ManyToOne
    private ProductoEntity producto;
    private int cantidad;

    public VentaEntity(){}

    public VentaEntity(Date fecha, ProductoEntity producto, int cantidad) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public VentaEntity(Long id, Date fecha, ProductoEntity producto, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ProductoEntity getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntity producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VentaEntity that = (VentaEntity) o;
        return cantidad == that.cantidad && id.equals(that.id) && fecha.equals(that.fecha) && Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, producto, cantidad);
    }
}
