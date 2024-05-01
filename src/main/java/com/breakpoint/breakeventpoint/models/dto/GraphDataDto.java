package com.breakpoint.breakeventpoint.models.dto;

public class GraphDataDto {
    private int index;
    private double costoTotal;
    private double ingresoOfVenta;

    public GraphDataDto(int index, double costoTotal, double ingresoOfVenta) {
        this.index = index;
        this.costoTotal = costoTotal;
        this.ingresoOfVenta = ingresoOfVenta;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getIngresoOfVenta() {
        return ingresoOfVenta;
    }

    public void setIngresoOfVenta(double ingresoOfVenta) {
        this.ingresoOfVenta = ingresoOfVenta;
    }
}
