/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.vehiculos.controlador;

import dam.vehiculos.clases.Vehiculo;
import dam.vehiculos.daos.DAOVehiculos;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dam
 */
public class Controlador {

    public static void cargarTabla(JTable tablaVehiculos) { //DefaultTableModel modeloDeDatosTabla = (DefaultTableModel) tablaVehiculos.getModel();
        List<Vehiculo> lstVehiculos = DAOVehiculos.getInstance().getVehiculos();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Marca");

        modelo.addColumn("Modelo");

        modelo.addColumn("Matricula");

        for (Vehiculo vehiculo : lstVehiculos) {

            Object[] registroLeido
                    = {
                        vehiculo.getMarca(),
                        vehiculo.getModelo(),
                        vehiculo.getMatricula()

                    };

            modelo.addRow(registroLeido);

        }

        tablaVehiculos.setModel(modelo);
    }
/*
    public static boolean insertarVehiculo(VehiculosFrm frmVehiculo, JTable tablaVehiculos) {
        boolean borrado = false;
        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setMarca(frmVehiculo.getTxtMarca().getText());

        vehiculo.setModelo(frmVehiculo.getTxtModelo().getText());

        vehiculo.setMatricula(frmVehiculo.getTxtMatricula().getText());

        if (DAOVehiculos.getInstance().insertarVehiculo(vehiculo) != 0) {
            borrado = true;
            cargarTabla(tablaVehiculos);
        }
        return borrado;
    }
*/
}
