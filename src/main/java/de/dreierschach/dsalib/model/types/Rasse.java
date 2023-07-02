package de.dreierschach.dsalib.model.types;

public enum Rasse {
    // TODO
    TULAMIDE("Tulamide");
    private final String bezeichnung;

    Rasse(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
