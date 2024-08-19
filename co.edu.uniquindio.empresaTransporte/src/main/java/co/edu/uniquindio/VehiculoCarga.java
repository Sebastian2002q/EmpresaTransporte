package co.edu.uniquindio;

import java.util.ArrayList;

public class VehiculoCarga extends Vehiculo{
    private int maxPasajeros;
    private final ArrayList<Usuario> listUsuariosAsociados;

    public VehiculoCarga(String placa, String marca, String modelo, String color, Propietario propietarioAsociado, int maxPasajeros) {
        super(placa, marca, modelo, color, propietarioAsociado);
        this.maxPasajeros = maxPasajeros;
        this.listUsuariosAsociados = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario){
        listUsuariosAsociados.add(usuario);
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }
}
