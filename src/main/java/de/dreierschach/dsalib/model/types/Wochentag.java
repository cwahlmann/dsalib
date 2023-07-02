package de.dreierschach.dsalib.model.types;

import java.util.Arrays;
import java.util.Optional;

public enum Wochentag {
    WINDSTAG(1, "Windstag"),
    ERDSTAG(2, "Erdstag"),
    MARKTTAG(3, "Markttag"),
    PRAIOSTAG(4, "Praiostag"),
    ROHALSTAG(5, "Rohalstag"),
    FEUERTAG(6, "Feuertag"),
    WASSERTAG(7, "Wassertag");
    private final String bezeichnung;
    private final int index;

    Wochentag(int index, String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.index = index;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getIndex() {
        return index;
    }

    public static Optional<Wochentag> get(int index) {
        return Arrays.stream(values()).filter(g -> g.index == index).findAny();
    }
}
