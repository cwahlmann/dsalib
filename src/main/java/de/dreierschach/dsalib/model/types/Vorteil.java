package de.dreierschach.dsalib.model.types;

public enum Vorteil {
    // TODO
    ;
    private String bezeichnung;

    Vorteil(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
