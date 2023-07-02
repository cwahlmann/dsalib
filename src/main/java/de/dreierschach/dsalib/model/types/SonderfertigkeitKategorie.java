package de.dreierschach.dsalib.model.types;

public enum SonderfertigkeitKategorie {
    NAHKAMPF("Nahkampf"), FERNKAMPF("Fernkampf"), MANOEVER("Manöver"), SONSTIGE("sonstige");

    private final String bezeichnung;

    SonderfertigkeitKategorie(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
