package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.Basiswert;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basiswerte {
    private final Map<Basiswert, Integer> modifikatoren;
    private final Map<Basiswert, Integer> zugekauft;

    public Basiswerte() {
        modifikatoren = Stream.of(Basiswert.values()).collect(Collectors.toMap(Function.identity(), e -> 0));
        zugekauft = Stream.of(Basiswert.values()).collect(Collectors.toMap(Function.identity(), e -> 0));
    }

    public int getBerechnet(Basiswert b, Eigenschaften e, Sonderfertigkeiten s) {
        return b.getBerechnung().apply(e, s);
    }

    public int getZugekauft(Basiswert b) {
        return zugekauft.get(b);
    }

    public Basiswerte withZugekauft(Basiswert b, int wert) {
        zugekauft.put(b, wert);
        return this;
    }

    public Basiswerte withModifikator(Basiswert b, int wert) {
        modifikatoren.put(b, wert);
        return this;
    }

    public int getModifikator(Basiswert b) {
        return modifikatoren.get(b);
    }

    public int getMaxZugekauft(Basiswert b, Eigenschaften e) {
        return b.getBerechnungMaxZugekauft().apply(e);
    }

    public int getAktuell(Basiswert b, Eigenschaften e, Sonderfertigkeiten s) {
        return getBerechnet(b, e, s) + getZugekauft(b) + getModifikator(b);
    }
}
