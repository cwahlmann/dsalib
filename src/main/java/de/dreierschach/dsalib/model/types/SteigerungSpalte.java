package de.dreierschach.dsalib.model.types;

public enum SteigerungSpalte {
    AKT("Akt."), A_STERN("A*"), A, B, C, D, E, F, G, H;
    private final String bezeichnung;

    SteigerungSpalte(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    SteigerungSpalte() {
        bezeichnung = name();
    }
}
