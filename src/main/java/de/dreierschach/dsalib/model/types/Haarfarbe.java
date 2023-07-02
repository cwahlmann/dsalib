package de.dreierschach.dsalib.model.types;

public enum Haarfarbe {
    // TODO
    MITTELBRAUN("mittelbraun"),
    DUNKELBRAUN("dunkelbraun");
    private String bezeichnung;

    Haarfarbe(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
