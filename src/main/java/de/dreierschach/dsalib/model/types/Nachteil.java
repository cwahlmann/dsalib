package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Modifikationen.mods;

public enum Nachteil {
    // TODO
    ;
    private final String bezeichnung;
    private final Modifikationen bonus;

    Nachteil(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.bonus = mods();
    }

    Nachteil(String bezeichnung, Modifikationen bonus) {
        this.bezeichnung = bezeichnung;
        this.bonus = bonus;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Modifikationen getMods() {
        return bonus;
    }
}
