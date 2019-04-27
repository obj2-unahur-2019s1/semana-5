package ar.edu.unahur.obj2.n3fli.modelo;

public class Capitulo implements Comparable<Capitulo> {

    private Integer numero;
    private String titulo;
    private int duracion;

    public Capitulo(int numero, String titulo, int duracion) {
        this.numero = numero;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Capitulo o) {
        return numero.compareTo(o.numero);
    }
}
