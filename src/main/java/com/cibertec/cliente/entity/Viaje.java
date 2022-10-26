package com.cibertec.cliente.entity;

public class Viaje {
    private int idViaje;
    private String placa;
    private int cantidadBoletos;
    private double precio;

    public Viaje(int idViaje, String placa, int cantidadBoletos, double precio) {
        this.idViaje = idViaje;
        this.placa = placa;
        this.cantidadBoletos = cantidadBoletos;
        this.precio = precio;
    }

    public Viaje() {
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
