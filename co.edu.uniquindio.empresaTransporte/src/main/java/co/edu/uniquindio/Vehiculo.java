package co.edu.uniquindio;

import java.util.ArrayList;

public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private Propietario propietarioAsociado;
    private ArrayList<Propietario> listPropietariosAsociados;

    public Vehiculo(String placa, String marca, String modelo, String color, Propietario propietarioAsociado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.propietarioAsociado = propietarioAsociado;
        this.listPropietariosAsociados = new ArrayList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
