package de.dreierschach.dsalib.model.types;

public enum Muttersprache {
    MUTERSPRACHE("Muttersprache", -2), ZWEITSPRACHE("Zweitsprache", -4);
    private final String bezeichnung;
    private final int modKL;

    Muttersprache(String bezeichnung, int modKL) {
        this.bezeichnung = bezeichnung;
        this.modKL = modKL;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getModKL() {
        return modKL;
    }
}
