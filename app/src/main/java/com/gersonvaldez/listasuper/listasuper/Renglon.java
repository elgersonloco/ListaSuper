package com.gersonvaldez.listasuper.listasuper;

import java.util.Date;

/**
 * Created by gerson on 01/05/17.
 */

public class Renglon {

    String nombre;
    Date fecha;
    Double precio;

    public Renglon(String nombre, Date fecha, Double precio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
