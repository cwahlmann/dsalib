package de.dreierschach.dsalib.model.types;

public enum Eigenschaft {
    MU("Mut"),
    KL("Klugheit"),
    IN("Intuition"),
    CH("Charisma"),
    FF("Fingerfertigkeit"),
    GE("Gewandheit"),
    KO("Konstitution"),
    KK("Körperkraft"),
    GS("Geschwindigkeit");
    private String bezeichnung;

    Eigenschaft(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
