package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.SonderfertigkeitKategorie.NAHKAMPF;

public enum Sonderfertigkeit {
    // TODO
    KAMPFGESPUEHR("Kampfgespühr", NAHKAMPF),
    KAMPFREFLEXE("Kampfreflexe", NAHKAMPF);

    private final String bezeichnung;
    private final SonderfertigkeitKategorie kategorie;

    Sonderfertigkeit(String bezeichnung, SonderfertigkeitKategorie kategorie) {
        this.bezeichnung = bezeichnung;
        this.kategorie = kategorie;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
