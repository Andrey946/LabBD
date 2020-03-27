/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.bitacora;
import Modelo.vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey
 */
public class controladorBitacora {

    private vehiculo carro;
    private Connection conexion;
    private Statement sentencias;
    private ResultSet datos;
    private bitacora bitacora;

    public void conectar() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/vehiculos?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();
            System.out.println("Exito");

        } catch (SQLException ex) {
            System.out.println("Error al conectar");
        }
    }

    public boolean agregar(Vista.vistaSalidas view, bitacora bita) {
        conectar();
        try {
            this.sentencias.executeUpdate("INSERT INTO `bitacora1` (`Id`, `Placa`, `Provincia`, `Destino`, `FechaSalida`, `HoraSalida`, `KInicial`, "
                    + "`FechaLlegada`, `HoraLlegada`, `KFinal`)"
                    + " VALUES (NULL," + view.txtplaca.getText() + ", '" + view.cmbProvincia.getSelectedItem() + "', '" + view.txtdestino.getText() + "', CURDATE(), CURTIME()," + view.spinInicial.getValue() + " , NULL, NULL, NULL)");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: Primero debe ingresar el vehículo");
        }
        return false;

    }

    public String buscar(Vista.vistaLlegadas view,bitacora bita) {
        conectar();
        try {
            this.datos = this.sentencias.executeQuery("SELECT * FROM `bitacora1` where Placa="+Integer.parseInt(view.txtplaca.getText())+" ORDER BY `Id` DESC");
            if (this.datos.next()) {
                view.cmbprovincia.setSelectedItem(datos.getString(3));
                view.txtdestino.setText(datos.getString(4));
                view.txtFinicial.setText(datos.getString(5));
                view.txtHinicial.setText(datos.getString(6));
                view.spinKMinicial.setValue(datos.getInt(7));
                view.spinKMfinal.setValue(datos.getInt(7));
            } else {
                JOptionPane.showMessageDialog(null, "LA BITACORA NO EXISTE");
            }
        } catch (SQLException ex) {
            System.out.println("Error en el Read");
        }
        return null;
    }

    public String actualizar(bitacora bita) {
        return null;
    }

    public String eliminar(bitacora bita) {
        return null;
    }

    public ArrayList listar(String find) {
        return null;
    }

    public String validarPK() {
        return null;
    }

    public String validarFK() {
        return null;
    }

}
