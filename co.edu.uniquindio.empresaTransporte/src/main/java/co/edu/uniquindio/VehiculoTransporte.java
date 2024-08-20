package co.edu.uniquindio;

import java.util.ArrayList;

public class VehiculoTransporte extends Vehiculo{
    private int maxPasajeros;
    private final ArrayList<Usuario> listUsuariosAsociados;

    public VehiculoTransporte(String placa, String marca, String modelo, String color, int maxPasajeros) {
        super(placa, marca, modelo, color);
        this.maxPasajeros = maxPasajeros;
        this.listUsuariosAsociados = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario){
        listUsuariosAsociados.add(usuario);
    }

    public ArrayList<Usuario> getListUsuariosAsociados() {
        return listUsuariosAsociados;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

}
