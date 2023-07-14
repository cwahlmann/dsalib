package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Basiswert.AsP;
import static de.dreierschach.dsalib.model.types.Basiswert.MR;
import static de.dreierschach.dsalib.model.types.Modifikationen.mods;
import static de.dreierschach.dsalib.model.types.Kampftechnik.*;
import static de.dreierschach.dsalib.model.types.Schrift.KUSLIKER_ZEICHEN;
import static de.dreierschach.dsalib.model.types.Schrift.TULAMIDYA_SCHRIFT;
import static de.dreierschach.dsalib.model.types.Sprache.*;
import static de.dreierschach.dsalib.model.types.Talent.*;

public enum Profession {
    // TODO
    GILDENMAGIER("Seekriegs-Magier der Univerisät zu Al'Anfa", mods()
            .mod(AsP, 18)
            .mod(MR, 2)
            .mod(RAUFEN, 1)
            .mod(RINGEN, 2)
            .mod(STAEBE, 2)
            .mod(KOERPERBEHERRSCHUNG, 1)
            .mod(SELBSTBEHERRSCHUNG, 4)
            .mod(SINNENSCHAERFE, 3)
            .mod(TANZEN, 2)
            .mod(BETOEREN, 2)
            .mod(ETIKETTE, 4)
            .mod(LEHREN, 2)
            .mod(MENSCHENKENNTNIS, 4)
            .mod(SCHRIFTLICHER_AUSDRUCK, 2)
            .mod(SICH_VERKLEIDEN, 3)
            .mod(UEBERREDEN, 2)
            .mod(UEBERZEUGEN, 1)
            .mod(BRETTSPIEL, 1)
            .mod(GEOGRAPHIE, 1)
            .mod(GESCHICHTSWISSEN, 2)
            .mod(GOETTER_KULTE, 3)
            .mod(MAGIEKUNDE, 5)
            .mod(PFLANZENKUNDE, 4)
            .mod(PHILOSOPHIE, 2)
            .mod(RECHNEN, 4)
            .mod(RECHTSKUNDE, 4)
            .mod(SAGEN_LEGENDEN, 3)
            .mod(STERNKUNDE, 2)
            .mod(TIERKUNDE, 3)
            .mod(BOSPARANO, 5)
            .mod(WALDMENSCHEN_SPRACHEN, 5)
            .mod(TULAMIDA, 5)
            .mod(UR_TULAMIDYA, 3)
            .mod(KUSLIKER_ZEICHEN, 8)
            .mod(TULAMIDYA_SCHRIFT, 4)
            .mod(ALCHIMIE, 5)
            .mod(HEILKUNDE_WUNDEN, 1)
            .mod(MALEN_ZEICHNEN, 4)
    );
    private final String bezeichnung;
    private final Modifikationen bonus;

    Profession(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.bonus = mods();
    }

    Profession(String bezeichnung, Modifikationen bonus) {
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
