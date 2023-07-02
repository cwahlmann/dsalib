package de.dreierschach.dsalib.model.types;

public enum Nachteil {
    // TODO
    ;
    private String bezeichnung;

    Nachteil(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
