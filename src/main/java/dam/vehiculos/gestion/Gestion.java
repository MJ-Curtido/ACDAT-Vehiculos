/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.vehiculos.gestion;

import dam.vehiculos.clases.Vehiculo;
import dam.vehiculos.daos.DAOVehiculos;
import static dam.vehiculos.vista.PanelCRUD.cargarTabla;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dam
 */
public class Gestion {
    private ArrayList<Vehiculo> listaVehiculo;
    
    public Gestion() {
        listaVehiculo = (ArrayList<Vehiculo>) DAOVehiculos.getInstance().getVehiculos();
    }
    
    public Boolean anyadirVehiculo(String marca, String modelo, String matricula) {
        boolean borrado = false;
        
        if (!DAOVehiculos.getInstance().existeVehiculo(matricula)) {
            Vehiculo vehiculo = new Vehiculo(marca, modelo, matricula);

            if (DAOVehiculos.getInstance().insertarVehiculo(vehiculo) != 0) {
                borrado = true;
                listaVehiculo = (ArrayList<Vehiculo>) DAOVehiculos.getInstance().getVehiculos();
            }
        }
        
        return borrado;
    }
    
    public void eliminarVehiculo (String marca, String modelo, String matricula) {
        Vehiculo vehiculo = new Vehiculo(marca, modelo, matricula);
        
        DAOVehiculos.getInstance().eliminarVehiculo(vehiculo);
        listaVehiculo = (ArrayList<Vehiculo>) DAOVehiculos.getInstance().getVehiculos();
    }

    public List<Vehiculo> getListaVehiculos() {
        return DAOVehiculos.getInstance().getVehiculos();
    }
}