package de.dreierschach.dsalib.model.types;

public enum Kultur {
    // TODO
    TULAMIDISCHE_STADTSTAATEN("Tulamidische Stadtstaaten");
    private final String bezeichnung;

    Kultur(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
