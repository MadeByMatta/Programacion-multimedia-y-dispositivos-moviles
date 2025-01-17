package com.example.ejerciciolistview;

public class Cancion {

    private String titulo;  // Título de la canción
    private int imagenResId;  // ID del recurso de la imagen

    // Constructor
    public Cancion(String titulo, int imagenResId) {
        this.titulo = titulo;
        this.imagenResId = imagenResId;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public int getImagenResId() {
        return imagenResId;
    }
}
