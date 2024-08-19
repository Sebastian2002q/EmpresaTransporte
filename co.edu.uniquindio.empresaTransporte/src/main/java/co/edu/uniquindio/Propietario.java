package co.edu.uniquindio;

import java.util.ArrayList;

public class Propietario {
    private String nombre;
    private String cedula;
    private String celular;
    private String email;
    private ArrayList<Vehiculo> vehiculos;
    private Vehiculo vehiculoAsociado;

    public Propietario(String nombre, String cedula, String celular, String email) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
        this.email = email;
        this.vehiculos = new ArrayList();
    }

    public Propietario() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
