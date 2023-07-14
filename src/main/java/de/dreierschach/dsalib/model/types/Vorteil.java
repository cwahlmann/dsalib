package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Modifikationen.mods;

public enum Vorteil {
    // TODO
    ;
    private final String bezeichnung;
    private final Modifikationen bonus;

    Vorteil(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.bonus = mods();
    }

    Vorteil(String bezeichnung, Modifikationen modifikationen) {
        this.bezeichnung = bezeichnung;
        this.bonus = modifikationen;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Modifikationen getMods() {
        return bonus;
    }
}
