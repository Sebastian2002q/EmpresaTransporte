package co.edu.uniquindio;

public class VehiculoTransporte extends Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoTransporte(String placa, String marca, String modelo, String color, Propietario propietarioAsociado, double capacidadCarga, int numeroEjes) {
        super(placa, marca, modelo, color, propietarioAsociado);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
