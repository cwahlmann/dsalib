package de.dreierschach.dsalib.model.types;

public enum Jahreszeit {
    SOMMER("Sommer", 1),
    HERBST("Herbst", 2),
    WINTER("Winter", 3),
    FRUEHLING("Frühling", 4);
    private final String bezeichnung;
    private final Integer index;

    Jahreszeit(String bezeichnung, int index) {
        this.bezeichnung = bezeichnung;
        this.index = index;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Integer getIndex() {
        return index;
    }
}
