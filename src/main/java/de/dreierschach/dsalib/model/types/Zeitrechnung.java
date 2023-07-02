package de.dreierschach.dsalib.model.types;

public enum Zeitrechnung {
    HORAS("Horas", "v.HE", 0, true),
    D_U("d.U.", "v.d.U.", 638, false),
    BF("BF","v.BF", 1492, false),
    GOLGARI("Golgari", "v.GE", 2177, true),
    RASTULLAH("Rastullah", "v.d. Offenbarung", 2251, true),
    HAL("Hal","v.H.",  2485, false)
    ;
    private final String bezeichnung;
    private final String beschreibungVor;
    private final int offset;
    private final boolean keinJahrNull;

    Zeitrechnung(String bezeichnung, String beschreibungVor, int offset, boolean keinJahrNull) {
        this.bezeichnung = bezeichnung;
        this.beschreibungVor = beschreibungVor;
        this.offset = offset;
        this.keinJahrNull = keinJahrNull;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getBeschreibungVor() {
        return beschreibungVor;
    }

    public int getOffset() {
        return offset;
    }

    public boolean isKeinJahrNull() {
        return keinJahrNull;
    }
}
