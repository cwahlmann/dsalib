package de.dreierschach.dsalib.model.types;

public enum Distanzklasse {
    H("Handgemenge"),
    N("Nahkampf"),
    S("Speer"),
    F("Fernkampf"),
    P("Pike")
    ;
    private String bezeichnung;

    Distanzklasse(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
