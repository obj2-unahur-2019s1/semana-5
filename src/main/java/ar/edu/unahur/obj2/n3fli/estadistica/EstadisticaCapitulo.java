package ar.edu.unahur.obj2.n3fli.estadistica;


import ar.edu.unahur.obj2.n3fli.modelo.Capitulo;

public class EstadisticaCapitulo implements Reproducible {

    private Capitulo capitulo;

    @Override
    public int minutosReproducidos() {
        return capitulo.getDuracion();
    }

    @Override
    public boolean completa() {
        return true;
    }
}
