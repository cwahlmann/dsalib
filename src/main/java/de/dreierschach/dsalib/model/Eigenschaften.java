package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.Eigenschaft;
import de.dreierschach.dsalib.model.types.Eigenschaftswert;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Eigenschaften {
    private final List<Eigenschaftswert> werte;
    private Eigenschaft leitEigenschaft;

    public Eigenschaften() {
        werte = Stream.of(Eigenschaft.values()).map(e ->
                        new Eigenschaftswert()
                                .withEigenschaft(e)
                                .withStart(0))
                .collect(Collectors.toList());
    }

    public Stream<Eigenschaftswert> getWerte() {
        return werte.stream();
    }

    public Eigenschaftswert getWert(Eigenschaft eigenschaft) {
        return werte.stream().filter(wert -> wert.getEigenschaft() == eigenschaft).findAny().orElseThrow();
    }

    public Eigenschaften withStart(Eigenschaft eigenschaft, int start) {
        werte.stream().filter(wert -> wert.getEigenschaft() == eigenschaft).findAny().ifPresent(
                eigenschaftswert -> eigenschaftswert.withStart(start)
        );
        return this;
    }
    
    public Eigenschaft getLeitEigenschaft() {
        return leitEigenschaft;
    }

    public Eigenschaften withLeitEigenschaft(Eigenschaft leitEigenschaft) {
        this.leitEigenschaft = leitEigenschaft;
        return this;
    }
}
