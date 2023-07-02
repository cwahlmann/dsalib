package de.dreierschach.dsalib.model.types;

public enum Profession {
    // TODO
    GILDENMAGIER("Gildenmagier");
    private final String bezeichnung;

    Profession(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
