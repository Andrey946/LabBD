/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.vehiculo;
import Vista.vistavehiculos;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class controladorVehiculo /*implements ActionListener*/ {

    private vistavehiculos view;
    private vehiculo carro;

    public controladorVehiculo(vistavehiculos view, vehiculo carro) {
        this.view = view;
        this.carro = carro;
    }

    public boolean agregar(vistavehiculos view, vehiculo carro) {

        return false;
    }

    public vehiculo buscar(vistavehiculos view, vehiculo carro) {

        return null;
    }

    public boolean actualizar(vistavehiculos view, vehiculo carro) {

        return false;
    }

    public boolean eliminar(vistavehiculos view, vehiculo carro) {

        return false;
    }

    public ArrayList listar(vistavehiculos view, vehiculo carro) {

        return null;
    }

    public boolean ValidarPK(vistavehiculos view, vehiculo carro) {

        return true;
    }

    public boolean validarFK(vistavehiculos view, vehiculo carro) {

        return true;
    }

}
