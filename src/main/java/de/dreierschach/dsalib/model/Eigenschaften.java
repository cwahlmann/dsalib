package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.Eigenschaft;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Eigenschaften {
    private final Map<Eigenschaft, Integer> werte;
    private final Map<Eigenschaft, Integer> modifikatoren;

    public Eigenschaften() {
        werte = Stream.of(Eigenschaft.values()).collect(Collectors.toMap(Function.identity(), e -> 0));
        modifikatoren = Stream.of(Eigenschaft.values()).collect(Collectors.toMap(Function.identity(), e -> 0));
    }

    public int getStart(Eigenschaft e) {
        return werte.get(e);
    }

    public Eigenschaften withStart(Eigenschaft e, int wert) {
        this.werte.put(e, wert);
        return this;
    }

    public int getModifikator(Eigenschaft e) {
        return modifikatoren.get(e);
    }

    public Eigenschaften withModifikator(Eigenschaft e, int wert) {
        this.modifikatoren.put(e, wert);
        return this;
    }

    public int getAktuell(Eigenschaft e) {
        return werte.get(e) + modifikatoren.get(e);
    }
}
