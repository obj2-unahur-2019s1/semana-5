package ar.edu.unahur.obj2.n3fli.modelo;

public class Actor {

    private String nombre;
    private String apellido;

    public Actor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


}
