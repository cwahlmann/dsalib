package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Basiswert.MR;
import static de.dreierschach.dsalib.model.types.Kampftechnik.*;
import static de.dreierschach.dsalib.model.types.Modifikationen.mods;
import static de.dreierschach.dsalib.model.types.Sprache.GARETHI;
import static de.dreierschach.dsalib.model.types.Sprache.TULAMIDA;
import static de.dreierschach.dsalib.model.types.Talent.*;

public enum Kultur {
    // TODO
    TULAMIDISCHE_STADTSTAATEN("Tulamidische Stadtstaaten", mods()
            .mod(MR, 1)
            .mod(DOLCHE, 2)
            .mod(RAUFEN, 1)
            .mod(RINGEN, 2)
            .mod(SAEBEL_TECHNIK, 1)
            .mod(SCHLEICHEN, 1)
            .mod(SICH_VERSTECKEN, 1)
            .mod(TANZEN, 1)
            .mod(TASCHENDIEBSTAHL, 1)
            .mod(GAUKELEIEN, 1)
            .mod(ETIKETTE, 1)
            .mod(GASSENWISSEN, 1)
            .mod(MENSCHENKENNTNIS, 2)
            .mod(SICH_VERKLEIDEN, 1)
            .mod(UEBERREDEN, 1)
            .mod(BRETTSPIEL, 2)
            .mod(GESCHICHTSWISSEN, 1)
            .mod(GOETTER_KULTE, 1)
            .mod(RECHNEN, 1)
            .mod(RECHTSKUNDE, 1)
            .mod(SAGEN_LEGENDEN, 2)
            .mod(SCHAETZEN, 2)
            .muttersprache(TULAMIDA)
            .zweitsprache(GARETHI)
            .mod(HAUSWIRTSCHAFT, 1)
    );
    private final String bezeichnung;
    private final Modifikationen modifikationen;

    Kultur(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.modifikationen = mods();
    }

    Kultur(String bezeichnung, Modifikationen modifikationen) {
        this.bezeichnung = bezeichnung;
        this.modifikationen = modifikationen;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Modifikationen getMods() {
        return modifikationen;
    }
}
