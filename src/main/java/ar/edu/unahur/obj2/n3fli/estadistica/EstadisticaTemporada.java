package ar.edu.unahur.obj2.n3fli.estadistica;

import ar.edu.unahur.obj2.n3fli.modelo.Temporada;

import java.util.Set;

public class EstadisticaTemporada implements Reproducible {

    private Temporada temporada;
    private Set<EstadisticaCapitulo> capitulos;

    public EstadisticaTemporada(Temporada temporada, Set<EstadisticaCapitulo> capitulos) {
        this.temporada = temporada;
        this.capitulos = capitulos;
    }

    @Override
    public int minutosReproducidos() {
        return capitulos.stream()
                .map(c -> c.minutosReproducidos())
                .reduce((v1,v2) -> v1 + v2)
                .get();
    }

    @Override
    public boolean completa() {
        return capitulos.stream()
                .allMatch(c -> c.completa());
    }
}

