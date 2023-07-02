package de.dreierschach.dsalib.model.types;

public enum Geschlecht {
    W("weiblich"), M("männlich");
    private final String bezeichnung;

    Geschlecht(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
