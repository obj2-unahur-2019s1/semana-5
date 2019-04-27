package ar.edu.unahur.obj2.n3fli.estadistica;


import ar.edu.unahur.obj2.n3fli.modelo.Serie;

import java.util.Set;

public class EstadisticaSerie implements Reproducible {

    private Serie serie;
    private Set<EstadisticaTemporada> temporadas;

    @Override
    public int minutosReproducidos() {
        return temporadas.stream()
                .map(c -> c.minutosReproducidos())
                .reduce((v1,v2) -> v1 + v2)
                .get();
    }

    @Override
    public boolean completa() {
        return temporadas.stream()
                .allMatch(c -> c.completa());
    }
}
