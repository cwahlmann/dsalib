package de.dreierschach.dsalib.model.types;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Distanzklassen extends HashSet<Distanzklasse> {
    public Distanzklassen() {
        super();
    }

    public Distanzklassen(Collection<? extends Distanzklasse> c) {
        super(c);
    }

    public static Distanzklassen dk(Distanzklasse... distanzklassen) {
        return new Distanzklassen(Arrays.stream(distanzklassen).collect(Collectors.toSet()));
    }
}
