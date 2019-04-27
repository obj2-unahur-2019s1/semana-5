package ar.edu.unahur.obj2.n3fli.modelo;

import java.util.Set;

public class Usuario {

    private String nombre;
    private Set<Pelicula> peliculasVistas;
    private Set<Serie>  seriesVistas;

    public Usuario(String nombre, Set<Pelicula> peliculasVistas, Set<Serie> seriesVistas) {
        this.nombre = nombre;
        this.peliculasVistas = peliculasVistas;
        this.seriesVistas = seriesVistas;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Pelicula> getPeliculasVistas() {
        return peliculasVistas;
    }

    public Set<Serie> getSeriesVistas() {
        return seriesVistas;
    }

    public boolean contenidoVisto(Pelicula pelicula) {
        return peliculasVistas.contains(pelicula);
    }

    public boolean contenidoVisto(Serie serie) {
        return false;
    }
}
