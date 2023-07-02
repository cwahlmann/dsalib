package de.dreierschach.dsalib.model.types;

public enum Augenfarbe {
    // TODO
    MITTELBRAUN("mittelbraun"),
    DUNKELBRAUN("dunkelbraun");
    private String bezeichnung;

    Augenfarbe(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
