package com.gersonvaldez.listasuper.listasuper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Renglon> datos = new ArrayList<Renglon>();
    private AdaptadorListaSuper adaptador;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_nuevo:
                datos.add(new Renglon("", "", ""));
                adaptador.notifyDataSetChanged();
                Log.i("ActionBar", "Nuevo!");
                return true;
            case R.id.action_settings:
                Log.i("ActionBar", "Settings!");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos.add(new Renglon("", "", ""));
        this.adaptador = new AdaptadorListaSuper(this, datos);
        ListView lstItems = (ListView) findViewById(R.id.itemsLst);
        lstItems.setAdapter(adaptador);


    }
}
