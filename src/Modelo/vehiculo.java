/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andrey
 */
public class vehiculo {
    private int Id;
    private String Placa;
    private String Descripcion;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public vehiculo() {
    }

    public vehiculo(String Placa, String Descripcion) {
        this.Placa = Placa;
        this.Descripcion = Descripcion;
    }

    public vehiculo(String Placa) {
        this.Placa = Placa;
    }
    
    public boolean comprobar(String Placa){
      return !Placa.equals("");
    }
}
