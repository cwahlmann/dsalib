package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Modifikationen.mods;

public enum Gabe {
    // TODO
    ;
    private final String bezeichnung;
    private final Modifikationen bonus;

    Gabe(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.bonus = mods();
    }

    Gabe(String bezeichnung, Modifikationen modifikationen) {
        this.bezeichnung = bezeichnung;
        this.bonus = modifikationen;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Modifikationen getBonus() {
        return bonus;
    }
}
