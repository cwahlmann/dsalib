package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.SteigerungSpalte.B;
import static de.dreierschach.dsalib.model.types.SteigerungSpalte.D;

public enum TalentKategorie {
    KOERPER("Körperliche Talente", D),
    GESELLSCHAFT("Gesellschaftliche Talente", B),
    NATUR("Natur-Talente", B),
    WISSEN("Wissenstalente", B),
    HANDWERK("Handwerkstalente", B),
    ;

    private final String bezeichnung;
    private final SteigerungSpalte steigerungstabelleSpalte;

    public String getBezeichnung() {
        return bezeichnung;
    }

    public SteigerungSpalte getSteigerungstabelleSpalte() {
        return steigerungstabelleSpalte;
    }

    TalentKategorie(String bezeichnung, SteigerungSpalte steigerungstabelleSpalte) {
        this.bezeichnung = bezeichnung;
        this.steigerungstabelleSpalte = steigerungstabelleSpalte;
    }
}
