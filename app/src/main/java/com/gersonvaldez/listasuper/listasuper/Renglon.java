package com.gersonvaldez.listasuper.listasuper;

/**
 * Created by gerson on 01/05/17.
 */

public class Renglon {

    String nombre;
    String fecha;
    String precio;

    public Renglon(String nombre, String precio, String fecha) {


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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
