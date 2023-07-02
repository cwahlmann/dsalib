package de.dreierschach.dsalib.model.types;

public enum TalentTyp {
    BASIS("Basis"),
    SPEZIAL("Spezial");
    private final String bezeichnung;

    TalentTyp(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
