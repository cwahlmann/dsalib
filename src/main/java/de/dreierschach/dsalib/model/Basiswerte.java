package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.Basiswert;
import de.dreierschach.dsalib.model.types.BasiswertWert;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basiswerte {
    private final List<BasiswertWert> werte;

    public Basiswerte() {
        werte = Stream.of(Basiswert.values()).map(basiswert ->
                        new BasiswertWert()
                                .withBasiswert(basiswert)
                                .withZugekauft(0)
                )
                .collect(Collectors.toList());
    }

    public Stream<BasiswertWert> getWerte() {
        return werte.stream();
    }

    public BasiswertWert getWert(Basiswert basiswert) {
        return werte.stream().filter(wert -> wert.getBasiswert() == basiswert).findAny().orElseThrow();
    }

    public Basiswerte withZugekauft(Basiswert basiswert, int zugekauft) {
        werte.stream().filter(wert -> wert.getBasiswert() == basiswert).findAny().ifPresent(wert -> wert.withZugekauft(zugekauft));
        return this;
    }
}
