package ar.edu.unahur.obj2.n3fli.modelo;

import java.util.Set;
import java.util.SortedSet;

public class Temporada {

    private Set<Capitulo> capitulos; // TreeSet



    public Capitulo ultimo() {
        return capitulos.stream()
                .reduce((c1,c2) -> {
                    if (c1.getNumero()>c2.getNumero()) return c1;
                    else return c2;
                }).get();
    }


}
