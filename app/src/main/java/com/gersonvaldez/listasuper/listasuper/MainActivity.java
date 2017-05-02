package com.gersonvaldez.listasuper.listasuper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Renglon[] datos = new Renglon[]{
            new Renglon("Titulo 1", new Date(), new Double(0.0)),
            new Renglon("Titulo 2", new Date(), new Double(0.0)),
            new Renglon("Titulo 3", new Date(), new Double(0.0)),
            new Renglon("Titulo 4", new Date(), new Double(0.0))};


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_nuevo:
                Log.i("ActionBar", "Nuevo!");
                return true;
            case R.id.action_settings:
                Log.i("ActionBar", "Settings!");
                ;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorListaSuper adaptador = new AdaptadorListaSuper(this, datos);

        ListView lstItems = (ListView) findViewById(R.id.itemsLst);
        lstItems.setAdapter(adaptador);


    }
}
