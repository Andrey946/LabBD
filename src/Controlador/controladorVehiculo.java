/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.vehiculo;
import Vista.Buscador;
import Vista.vistavehiculos;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class controladorVehiculo extends Modelo.vehiculo {

    private vehiculo carro;
    private Connection conexion;
    private Statement sentencias;
    private ResultSet datos;

    public void conectar() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/vehiculos?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();
            System.out.println("Exito");

        } catch (SQLException ex) {
            System.out.println("Error al conectar");
        }
    }

    public controladorVehiculo(vehiculo carro) {
        super();

        this.carro = carro;
    }

    public boolean agregar(vistavehiculos view, vehiculo carro) {
        conectar();
        try {

            this.sentencias.executeUpdate("insert into vehiculos values(null,'" + view.txtplaca.getText() + "','" + view.txtdescripcion.getText() + "')");
            return true;
        } catch (SQLException ex) {
            System.out.println("Error al Agregar");
        }

        return false;
    }

    public vehiculo buscar(vehiculo carro) {

        return null;
    }

    public boolean actualizar(vistavehiculos view, vehiculo carro) {
        conectar();
        try {
            this.sentencias.executeUpdate("update vehiculos set Descripcion='" + view.txtdescripcion.getText() + "' where Placa=" + view.txtplaca.getText());
            return true;
            //Tener cuidado con los updates y deletes si no coloca un where tendra problemas GRAVES
            //UPDATES y DELETES es obligatorio tener WHERE
            //NO EJECUTAR LA SIGUIENTE LINEA 
            //  this.sentencias.executeUpdate("update datosgenerales set nombre='" + nombre + "',ciudad='" + ciudad + "");
        } catch (SQLException ex) {
            System.out.println("ERROR EN UPDATE");
        }

        return false;
    }

    public boolean eliminar(vistavehiculos view, vehiculo carro) {
        conectar();
        try {
            this.sentencias.executeUpdate("delete from vehiculos where Placa=" + view.txtplaca.getText());
            return true;
        } catch (SQLException ex) {
            System.out.println(" Error en el DELETE");
        }

        return false;
    }

    public ArrayList listar(Buscador buscador, String descrip) {
        conectar();
        try {
            this.datos = this.sentencias.executeQuery("select * from vehiculos WHERE Descripcion  LIKE '%" + buscador.txtdescripcion.getText() + "%'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                System.out.println("NO HAY MAS REGISTROS");
            }
        } catch (SQLException ex) {
            System.out.println("Error en el Read");
        }
        return null;
    }

    public boolean ValidarPK(vistavehiculos view, vehiculo carro) {

        return true;
    }

    public boolean validarFK(vistavehiculos view, vehiculo carro) {

        return true;
    }

}
