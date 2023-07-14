package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Modifikationen.mods;
import static de.dreierschach.dsalib.model.types.SonderfertigkeitKategorie.NAHKAMPF;

public enum Sonderfertigkeit {
    // TODO
    KAMPFGESPUEHR("Kampfgespühr", NAHKAMPF),
    KAMPFREFLEXE("Kampfreflexe", NAHKAMPF);

    private final String bezeichnung;
    private final SonderfertigkeitKategorie kategorie;
    private final Modifikationen modifikationen;

    Sonderfertigkeit(String bezeichnung, SonderfertigkeitKategorie kategorie) {
        this.bezeichnung = bezeichnung;
        this.kategorie = kategorie;
        this.modifikationen = mods();
    }

    Sonderfertigkeit(String bezeichnung, SonderfertigkeitKategorie kategorie, Modifikationen modifikationen) {
        this.bezeichnung = bezeichnung;
        this.kategorie = kategorie;
        this.modifikationen = modifikationen;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public SonderfertigkeitKategorie getKategorie() {
        return kategorie;
    }

    public Modifikationen getMods() {
        return modifikationen;
    }
}
