package de.dreierschach.dsalib.model.types;

public enum WaffeBemerkung {
    I("i: improvisierte Waffe, meist ein Werkzeug"),
    I_("(i): Fernwaffen, die nicht für den Nahkampf ausgewuchtet sind."),
    W("w: kann auch geworfen werden"),
    W_("(w): kann als improvisierte Wurfwaffe verwendet werden"),
    Z("z: Zweihandwaffe, Schild nicht nutzbar"),
    P("p: kann nur von priviligierten Gruppen verwendet werden (Krieger, Ritter, Magier...)")
    ;
    private final String bezeichnung;

    public String getBezeichnung() {
        return bezeichnung;
    }

    WaffeBemerkung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
