/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Andrey
 */
public class bitacora {

    private int id;
    private String Placa;
    private String Provincia;
    private String Destino;
    private Date fechaSalida;
    private Time horaSalida;
    private int kmInicial;
    private Date fechaLlegada;
    private Time horaLlegada;
    private int kmFinal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public Date getFechaSalida() {
        if (getFechaLlegada().compareTo(getFechaSalida()) == 0) {

        }

        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;

    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Time getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public bitacora() {
        this.id = 0;
        this.Placa = "";
        this.Provincia = "";
        this.Destino = "";
        this.fechaSalida = null;
        this.horaSalida = null;
        this.kmInicial = 0;
        this.fechaLlegada = null;
        this.horaLlegada = null;
        this.kmFinal = 0;
    }

    public bitacora(int id, String Placa, String Provincia, String Destino, Date fechaSalida, Time horaSalida, int kmInicial, Date fechaLlegada, Time horaLlegada, int kmFinal) {
        this.id = id;
        this.Placa = Placa;
        this.Provincia = Provincia;
        this.Destino = Destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.kmInicial = kmInicial;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.kmFinal = kmFinal;
    }

    public bitacora(String Placa) {
        this.id = 0;
        this.Placa = Placa;
        this.Provincia = "";
        this.Destino = "";
        this.fechaSalida = null;
        this.horaSalida = null;
        this.kmInicial = 0;
        this.fechaLlegada = null;
        this.horaLlegada = null;
        this.kmFinal = 0;
    }

    public boolean comprobar() {
        return (this.id != 0) && (!this.Placa.equals("")) && (!this.Placa.equals("")) && (!this.Provincia.equals(""))
                && (this.Destino.equals("")) && (this.fechaSalida != null) && (this.horaSalida != null) && (this.kmInicial != 0);
    }

}
