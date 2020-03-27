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
import java.util.Arrays;
import javax.swing.JOptionPane;

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
    int num = 0;

    public boolean agregar(vistavehiculos view, vehiculo carro) {
        conectar();
        try {
            this.datos = this.sentencias.executeQuery("select * from vehiculos WHERE Placa  LIKE '%" + view.txtplaca.getText() + "%' AND Descripcion LIKE '%" + view.txtdescripcion.getText() + "%' ");

            if (this.datos.next()) {
                JOptionPane.showMessageDialog(null, " Ya existe ese vehículo ", "Error", 2);
            } else {
                this.sentencias.executeUpdate("insert into vehiculos values(null,'" + view.txtplaca.getText() + "','" + view.txtdescripcion.getText() + "')");
                JOptionPane.showMessageDialog(null, "Agregado Correctamente ");
            }

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

        ArrayList<Object> al = new ArrayList();
        ArrayList<Object[]> ak = new ArrayList<>();
        try {
            this.datos = this.sentencias.executeQuery("select * from vehiculos WHERE Descripcion  LIKE '%" + buscador.txtdescripcion.getText() + "%'");

            while (this.datos.next()) {
                al.add((Object) datos.getInt(2));

                al.add((Object) datos.getString(3));

                Object[] ap = al.toArray();
                ak.add(ap);
            }

            System.out.println("NO HAY MAS REGISTROS");

            for (int i = 0; i < al.size(); i++) {
                System.out.print(al.get(i));
            }

            return ak;
        } catch (SQLException ex) {
            System.out.println("Error en el Read");
        }
        return null;
    }
    

    public boolean ValidarPK(vehiculo carro) {

        try {
            this.datos = this.sentencias.executeQuery("select * from vehiculo where vehiculo='" + carro + "'");

            while (this.datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            }
            System.out.println("NO HAY MAS REGISTROS");

        } catch (SQLException ex) {
            System.out.println("Error en el Read");
        }

        return true;
    }

    public boolean validarFK(vistavehiculos view, vehiculo carro) {

        return true;
    }
    
    public void vehiculoactual(vistavehiculos view){
         conectar();
        try {
            this.datos = this.sentencias.executeQuery("SELECT * FROM vehiculos order by Id desc limit 1");
                 while(this.datos.next()) {
                view.txtplaca.setText(datos.getString(2));
                view.txtdescripcion.setText(datos.getString(3));
            }
    
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
