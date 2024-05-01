package com.breakpoint.breakeventpoint.models.dto;

public class DoubleResponseDto {
    private double value;

    public DoubleResponseDto(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
