package de.dreierschach.dsalib.model.types;

public enum KampftechnikKategorie {
    BEW_NAHKAMPF("Bewaffneter Nahkampf"),
    FERNKAMPF("Fernkampf"),
    WAFFENLOS("Waffenlos"),
    BEW_KAMPF_AT_TECHNIK("Bew. Kampf; AT-Technik")

    ;
    private final String bezeichnung;

    KampftechnikKategorie(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
