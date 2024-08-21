package co.edu.uniquindio;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MainTransporte {
    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = inicializarDatos();
        Propietario propietario = pedirDatos();
        showMessageDialog(null,"Vehiculo asociado= " + propietario.getVehiculoAsociado());
        double limite = Double.parseDouble(showInputDialog("Ingrese el limite de peso= "));
        showMessageDialog(null,"Usuarios que superan el limite de peso= " + empresaTransporte.UsuariosPeso(limite));
        showMessageDialog(null,empresaTransporte.UsuariosPorPlaca("AAA111"));
        showMessageDialog(null, empresaTransporte.numPropietariosMayoresCuarentaAnios());
        int rangoSup = Integer.parseInt(showInputDialog("Ingrese el rango superior= "));
        int rangoInf = Integer.parseInt(showInputDialog("Ingrese el rango inferior= "));
        showMessageDialog(null, empresaTransporte.UsuariosRangoEdad(rangoSup, rangoInf));
    }

    /**
     * Se crean los objetos necesarios para crear una EmpresaTransporte
     * @return radioTaxi
     */
    public static EmpresaTransporte inicializarDatos (){
        EmpresaTransporte radioTaxi = new EmpresaTransporte();
        Vehiculo vehiculo = new VehiculoTransporte("AAA111","Chevrolet","2024","Rojo",10);
        Vehiculo vehiculo2 = new VehiculoCarga("BBB222","Chevrolet","2024","Negro",20,4);
        Propietario propietario = new Propietario("Pepito","123456789","3124567892","pepito@gmail.com",102);
        Propietario propietario1 = new Propietario("Pepite","123456789","3124567892","pepite@gmail.com",39);
        Propietario propietario2 = new Propietario("Pepiti","123456789","3124567892","pepiti@gmail.com",41);
        Propietario propietario3 = new Propietario("Pepitu","123456789","3124567892","pepitu@gmail.com",46);
        Usuario usuario0 = new Usuario("Perez","102", 314.0);
        Usuario usuario = new Usuario("Pepe", "21", 70.0);
        Usuario usuario1 = new Usuario("Pepa", "50", 76.0);
        Usuario usuario2 = new Usuario("Pape", "23", 60.0);
        Usuario usuario3 = new Usuario("Pope", "84", 50.0);
        radioTaxi.registrarUsuario(usuario0);
        radioTaxi.registrarUsuario(usuario);
        radioTaxi.registrarUsuario(usuario1);
        radioTaxi.registrarUsuario(usuario2);
        radioTaxi.registrarUsuario(usuario3);
        radioTaxi.registrarPropietario(propietario);
        radioTaxi.registrarPropietario(propietario1);
        radioTaxi.registrarPropietario(propietario2);
        radioTaxi.registrarPropietario(propietario3);
        radioTaxi.registrarVehiculoTransporte(vehiculo);
        radioTaxi.registrarVehiculoCarga(vehiculo2);
        return radioTaxi;
    }

    /**
     * Pide los datos de cada atributo, de cada objeto, para así crear una "empresa"
     * @return empresa de tipo EmpresaTransporte
     */
    public static Propietario  pedirDatos (){
        EmpresaTransporte empresa = new EmpresaTransporte();
        JOptionPane.showMessageDialog(null,"Datos del propietario");
        String nombre = showInputDialog("Nombre= ");
        String cedula = showInputDialog("Cedula= ");
        String celular = showInputDialog("Celular= ");
        String email = showInputDialog("Email= ");
        int edad = Integer.parseInt(showInputDialog("Edad= "));
        Propietario propietario = new Propietario(nombre,cedula,celular,email,edad);
        int i = Integer.parseInt(showInputDialog("Número de vehículos: "));
        for (int j = 0; j < i; j++) {
            String bool = showInputDialog("'T' para transporte ó 'C' para carga: ");
            if (bool.equalsIgnoreCase("T")) {
                String placa = showInputDialog("Placa: ");
                String marca = showInputDialog("Marca: ");
                String modelo = showInputDialog("Modelo: ");
                String color = showInputDialog("Color: ");
                int maxPasajeros = Integer.parseInt(showInputDialog("Max pasajeros: "));
                VehiculoTransporte vehiculo = new VehiculoTransporte(placa, marca, modelo, color, maxPasajeros);
                empresa.registrarVehiculoTransporte(vehiculo);
                propietario.asociarVehiculo(vehiculo);
            } else if (bool.equalsIgnoreCase("C")) {
                String placa = showInputDialog("Placa: ");
                String marca = showInputDialog("Marca: ");
                String modelo = showInputDialog("Modelo: ");
                String color = showInputDialog("Color: ");
                double capCarga = Double.parseDouble(showInputDialog("Capacidad de carga: "));
                int numEjes = Integer.parseInt(showInputDialog("Número de ejes: "));
                VehiculoCarga vehiculo = new VehiculoCarga(placa, marca, modelo, color, capCarga, numEjes);
                empresa.registrarVehiculoCarga(vehiculo);
                propietario.asociarVehiculo(vehiculo);
            }
        }
        return propietario;
    }
}