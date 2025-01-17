package com.example.ejerciciolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Cancion> {

    private Context context;
    private int resourcelayout;

    public MyAdapter(Context context, int resourcelayout, ArrayList<Cancion> nombres){
        super(context, resourcelayout, nombres);
        this.context = context;
        this.resourcelayout = resourcelayout;
        this.context=context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(context);
            view = vi.inflate(resourcelayout, null);
        }

        // Obtenemos el objeto Cancion en la posición correspondiente
       Cancion cancion = getItem(position);

        if (cancion != null) {
            TextView textView = view.findViewById(R.id.textoelemento);
            ImageView imageView = view.findViewById(R.id.imagenelemento);

            // Asignamos los valores correspondientes al TextView y al ImageView
            if (textView != null) {
                textView.setText(cancion.getTitulo());
            }

            if (imageView != null) {
                imageView.setImageResource(cancion.getImagenResId());  // Asignamos la imagen usando el ID del recurso
            }
        }

        return view;
    }


}