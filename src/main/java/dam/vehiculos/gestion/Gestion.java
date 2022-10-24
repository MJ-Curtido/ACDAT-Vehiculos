/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.vehiculos.gestion;

import dam.vehiculos.clases.Vehiculo;
import dam.vehiculos.daos.DAOVehiculos;
import java.util.ArrayList;

/**
 *
 * @author Dam
 */
public class Gestion {
    private ArrayList<Vehiculo> listaVehiculo;
    
    public Gestion() {
        listaVehiculo = (ArrayList<Vehiculo>) DAOVehiculos.getInstance().getVehiculos();
    }
    
    public void anyadirVehiculo() {
        
    }
}