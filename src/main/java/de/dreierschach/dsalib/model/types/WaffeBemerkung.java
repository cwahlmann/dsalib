package de.dreierschach.dsalib.model.types;

public enum WaffeBemerkung {
    i("i: improvisierte Waffe, meist ein Werkzeug"),
    i_("(i): Fernwaffen, die nicht für den Nahkampf ausgewuchtet sind."),
    w("w: kann auch geworfen werden"),
    w_("(w): kann als improvisierte Wurfwaffe verwendet werden"),
    z("z: Zweihandwaffe, Schild nicht nutzbar"),
    p("p: kann nur von priviligierten Gruppen verwendet werden (Krieger, Ritter, Magier...)")
    ;
    private final String bezeichnung;

    public String getBezeichnung() {
        return bezeichnung;
    }

    WaffeBemerkung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
