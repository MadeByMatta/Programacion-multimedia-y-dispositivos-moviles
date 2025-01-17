package com.example.ejerciciolistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listview1;
    private ArrayList<Cancion> nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview1 = findViewById(R.id.listview1);

        nombres = new ArrayList<>();
        nombres.add(new Cancion("Supreme",R.drawable.supreme));
        nombres.add(new Cancion("Baddie",R.drawable.baddie));
        nombres.add(new Cancion("Outside",R.drawable.outside));
        nombres.add(new Cancion("Parties, Viajes Y Conciertos",R.drawable.parties_viajes_y_conciertos));
        nombres.add(new Cancion("On God",R.drawable.on_god));
        nombres.add(new Cancion("Motivation #20",R.drawable.motivation20));
        nombres.add(new Cancion("Shake That Ass",R.drawable.shake_that_ass));
        nombres.add(new Cancion("+99 en el DM", R.drawable.mas99_en_el_dm));

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,nombres);
        MyAdapter adapter = new MyAdapter(MainActivity.this,R.layout.list_item, nombres);
        listview1.setAdapter(adapter);

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cancion cancion = nombres.get(position);
                Toast.makeText(MainActivity.this, "Has pulsado: "+ cancion.getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}