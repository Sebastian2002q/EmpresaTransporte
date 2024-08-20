package co.edu.uniquindio;

public class Usuario {
    private String nombre;
    private String edad;
    private VehiculoTransporte vehiculoAsociado;
    private Double peso;

    public Usuario(String nombre, String edad, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //public Usuario(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Double getPeso() { return peso;}

    public void setPeso(Double peso) {this.peso = peso;}

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado=vehiculoAsociado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
