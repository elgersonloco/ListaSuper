package com.gersonvaldez.listasuper.listasuper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by gerson on 01/05/17.
 */

public class AdaptadorListaSuper extends ArrayAdapter<Renglon> {


    private final Renglon[] datos;

    public AdaptadorListaSuper(Context context, Renglon[] datos) {
        super(context, R.layout.layout_componente_lista, datos);
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.layout_componente_lista, null);

        TextView nombreProducto = (TextView) item.findViewById(R.id.nombreProducto);
        nombreProducto.setText(datos[position].getNombre());
        TextView precioProducto = (TextView) item.findViewById(R.id.precioProducto);
        precioProducto.setText(datos[position].getPrecio().toString());
        TextView fechaUltimaCompra = (TextView) item.findViewById(R.id.fechaCompra);
        fechaUltimaCompra.setText(datos[position].getFecha().toString());

        return item;
    }
}
