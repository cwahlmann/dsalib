package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Basiswert.*;
import static de.dreierschach.dsalib.model.types.Modifikationen.mods;

public enum Rasse {
    TULAMIDE("Tulamide", mods()
            .mod(LE, 10)
            .mod(AU, 10)
            .mod(MR, -4)
    );
    private final String bezeichnung;
    private final Modifikationen bonus;

    Rasse(String bezeichnung) {
        this.bezeichnung = bezeichnung; this.bonus = mods();
    }

    Rasse(String bezeichnung, Modifikationen modifikationen) {
        this.bezeichnung = bezeichnung; this.bonus = modifikationen;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Modifikationen getMods() {
        return bonus;
    }
}
