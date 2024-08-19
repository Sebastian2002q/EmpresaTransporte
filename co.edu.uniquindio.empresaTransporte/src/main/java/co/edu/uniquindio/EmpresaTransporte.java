package co.edu.uniquindio;

import java.util.ArrayList;

public class EmpresaTransporte {
    private ArrayList<Propietario> listPropietarios;
    private ArrayList<Vehiculo> listVehiculosTransporte;
    private ArrayList<Vehiculo> listVehiculosCarga;
    private ArrayList<Usuario> listUsuarios;

    public EmpresaTransporte(ArrayList<Propietario> listPropietarios,
                             ArrayList<Vehiculo> listVehiculosTransporte,
                             ArrayList<Vehiculo> listVehiculosCarga,
                             ArrayList<Usuario> listUsuarios) {
        this.listPropietarios = listPropietarios;
        this.listVehiculosTransporte = listVehiculosTransporte;
        this.listVehiculosCarga = listVehiculosCarga;
        this.listUsuarios = listUsuarios;
    }

    public EmpresaTransporte() {}

    public ArrayList<Vehiculo> getListVehiculosTransporte() {
        return listVehiculosTransporte;
    }

    public void setListVehiculosTransporte(ArrayList<Vehiculo> listVehiculosTransporte) {
        this.listVehiculosTransporte = listVehiculosTransporte;
    }

    public ArrayList<Propietario> getListPropietarios() {
        return listPropietarios;
    }

    public void setListPropietarios(ArrayList<Propietario> listPropietarios) {
        this.listPropietarios = listPropietarios;
    }

    public ArrayList<Vehiculo> getListVehiculosCarga() {
        return listVehiculosCarga;
    }

    public void setListVehiculosCarga(ArrayList<Vehiculo> listVehiculosCarga) {
        this.listVehiculosCarga = listVehiculosCarga;
    }

    public ArrayList<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(ArrayList<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
}
