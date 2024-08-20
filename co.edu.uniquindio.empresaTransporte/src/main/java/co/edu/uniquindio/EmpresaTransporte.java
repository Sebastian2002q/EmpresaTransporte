package co.edu.uniquindio;

import java.util.ArrayList;

public class EmpresaTransporte {
    private ArrayList<Propietario> listPropietarios;
    private ArrayList<Vehiculo> listVehiculosTransporte;
    private ArrayList<Vehiculo> listVehiculosCarga;
    private ArrayList<Usuario> listUsuarios;

    public EmpresaTransporte() {
        this.listPropietarios = new ArrayList<>();
        this.listVehiculosTransporte = new ArrayList<>();
        this.listVehiculosCarga = new ArrayList<>();
        this.listUsuarios = new ArrayList<>();
    }

    public void registrarPropietario(Propietario propietario) {
        listPropietarios.add(propietario);
    }

    public void eliminarPropietario(Propietario propietario) {
        listPropietarios.remove(propietario);
    }

    public void registrarVehiculoTransporte(Vehiculo vehiculo) {
        listVehiculosTransporte.add(vehiculo);
    }

    public void eliminarVehiculoTransporte(Vehiculo vehiculo) {
        listVehiculosTransporte.remove(vehiculo);
    }

    public void registrarVehiculoCarga(Vehiculo vehiculo) {
        listVehiculosCarga.add(vehiculo);
    }

    public void eliminarVehiculoCarga(Vehiculo vehiculo) {
        listVehiculosCarga.remove(vehiculo);
    }

    public void registrarUsuario(Usuario usuario) {
        listUsuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        listUsuarios.remove(usuario);
    }

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

    /**
     * Obtiene el numero de usuarios transportados por vehiculo de transporte a traves del numero de placa
     *
     * @param {String} placa
     * @returns {int} - numero de usuarios
     */
    public int UsuariosPorPlaca(String placa) {
        int usuarios = 0;
        for (Vehiculo vehiculo : listVehiculosTransporte) {
            if (vehiculo.getPlaca().equals(placa)) {
                for (Usuario usuario : ((VehiculoTransporte)vehiculo).getListUsuariosAsociados()) {
                    usuarios++;
                }
            }
        }
        return usuarios;
    }

    /**
     * Obtiene la cantidad de usuarios en un rango de edad dado
     *
     * @param {int} rangoSup, rangoInf
     * @returns {int} - contador de usuarios dentro del rango
     */
    public int UsuariosRangoEdad(int rangoSup, int rangoInf){
        int numUsuarios = 0;
        for (Usuario usuario : listUsuarios) {
            if(Integer.parseInt(usuario.getEdad()) >= rangoInf && Integer.parseInt(usuario.getEdad()) <= rangoSup){
                numUsuarios++;
            }
        }
        return numUsuarios;
    }

    /**
     * Filtra los usuarios que superan el peso suministrado como parámetro
     *
     * @param {Usuario} usuario
     * @param {double} peso
     * @return {List<Usuario>} - lista de usuarios filtrados según el criterio
     */
    public ArrayList<Usuario> UsuariosPeso(double peso) {
        ArrayList<Usuario> usuariosFiltrados = new ArrayList<>();
        for (Usuario usuario : listUsuarios) {
            if (usuario.getPeso() > peso) {
                usuariosFiltrados.add(usuario);
            }
        }
        return usuariosFiltrados;
    }

    /**
     * Obtiene el número de propietarios mayores a 40 años
     *
     * @return {int} - contador
     */
    public int numPropietariosMayoresCuarentaAnios() {
        int contador = 0;
        for (Propietario propietario : listPropietarios){
            if (propietario.getEdad() > 40){
                contador++;
            }
        }
        return contador;
    }
}
