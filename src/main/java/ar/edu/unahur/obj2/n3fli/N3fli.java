package ar.edu.unahur.obj2.n3fli;


import ar.edu.unahur.obj2.n3fli.modelo.Pelicula;
import ar.edu.unahur.obj2.n3fli.modelo.Serie;
import ar.edu.unahur.obj2.n3fli.modelo.Usuario;

import java.util.Set;

public class N3fli {

    private Set<Pelicula> contenido;
    private Set<Serie> series;
    private Set<Usuario> usuarios;

    public boolean contenidoVisto(Usuario usuario, Serie serie) {
        return false;
    }

    public boolean contenidoVisto
            (Usuario usuario, Pelicula pelicula) {
        /*Optional<Usuario> maybeUsuario = usuarios.stream()
                .filter(u -> u.equals(usuario))
                .findAny();

        if (maybeUsuario.isPresent()) {
            return maybeUsuario.get().contenidoVisto(pelicula);
        } else {
            throw new RuntimeException("Usuario Inexistente");
        }*/


        return usuarios.stream()
                .filter(u -> u.equals(usuario))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Usuario Inexistente"))
                .contenidoVisto(pelicula);
    }

}
