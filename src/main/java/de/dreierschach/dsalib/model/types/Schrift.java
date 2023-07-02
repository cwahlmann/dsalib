package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.SteigerungSpalte.*;

public enum Schrift {
    ALTES_ALAANI("Altes Alaani", "um 1.000 Wort- und Silbenzeichen", 18, A),
    ALTES_KEMI_SCHRIFT("Altes Kemi", "mehrere tausend Wort- und Deutzeichen", 21, A),
    AMULASHTRA_MODERN("Amulashtra (modern)", "modern; alte Artefakt-Schrift; 24 Lautzeichen", 11, A),
    AMULASHTRA_HISTORISCH("Amulashtra (historisch)", "alte Artefakt-Schrift; um 300 Zeichen", 17, A),
    ANGRAM_GLYPHEN("Angram", "altzwergische Bilderschrift", 21, A),
    ARKANIL("Arkanil", "'Rohalschrift'; magisch potente Schrift; unbekannte Zeichenzahl", 24, C),
    CHRMK("Chrmk", "'Zelemja'; 50.00 Wort- und Deutzeichen", 18, A),
    CHUCHAS("Chuchas", "'Yash-Hualay-Glyphen', 'Protozelemja'; um 20.000 Zeichen", 24, B),
    DRAKJARD_ZINKEN("Drakjard-Zinken", "'Zauberrunen' für Ritzungen; 24 Lautzeichen, spezielle Ligaturen möglich", 9, A),
    DRAKNED_GLYPHEN("Drakned-Glyphen", "angebliche 'Umschrift' des Drachischen", 15, B),
    GEHEILIGTE_GLYPHEN_VON_UNAU("Geheiligte Glyphen Von Unau", "19 Laut- und Deutzeichen", 13, A),
    GIMARIL("Gimaril", "verbreitete 'Geheim'-Schrift mit 29 Laut- und Deutzeichen", 10, A),
    GJALSKISCH("Gjalskisch", "Misch-Schrift aus Hjaldingschen Runen und Ur-Tulamidya", 14, A),
    HJALDINGSCHE_RUNEN("Hjalsingsche Runen", "um 30 Lautzeichen (Komplexität 10) und mehrere Dutzend Piktogramme (Komplexität 16)", 16, A),
    IMPERIALE_ZEICHEN("Imperiale Zeichen", "'Altgüldenländisch'; 57 Lautzeichen", 12, A),
    ISDIRA_SCHRIFT("Isdira", "27 Lautzeichen (Komplexität 15), dazu subtile Deutzeichen (Komplexität 18)", 18, A),
    ASDHARIA_SCHRIFT("Asdharia", "27 Lautzeichen (Komplexität 15), dazu subtile Deutzeichen (Komplexität 18)", 18, A),
    KUSLIKER_ZEICHEN("Kusliker Zeichen", "31 Lautzeichen", 10, A),
    MAHRISCHE_GLYPHEN("Mahrische Glyphen", "viele Hundert Bildzeichen, nahezu unbekannt", 15, B),
    NANDURIA("Nanduria", "häufige 'Geheim'-Schrift, 26 Lautzeichen", 10, A),
    ROGOLAN_RUNEN("Rogolan", "24 Laut-Runen, davon 4 wenig verwendet", 11, A),
    TROLLISCHE_RAUMBILDERSCHRIFT("Trollische 'Raumbilderschrift'", "dreidimensionale Steinsetzungen", 24, C),
    TULAMIDYA_SCHRIFT("Tulamidya", "56 Silbenzeichen", 14, A),
    UR_TULAMIDYA_SCHRIFT("Ur-Tulamidya", "um 300 Wort-, Deut- und Silbenzeichen", 16, A),
    ZHAYAD_SCHRIFT("Zhayad", "Magier-Geheimschrift; mehrere hundert Laut- und Silbenzeichen", 18, A);
    private final String bezeichnung;
    private final String beschreibung;
    private final int komplexitaet;
    private final SteigerungSpalte steigerungSpalte;

    Schrift(String bezeichnung, String beschreibung, int komplexitaet, SteigerungSpalte steigerungSpalte) {
        this.bezeichnung = bezeichnung;
        this.beschreibung = beschreibung;
        this.komplexitaet = komplexitaet;
        this.steigerungSpalte = steigerungSpalte;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getKomplexitaet() {
        return komplexitaet;
    }

    public SteigerungSpalte getSteigerungSpalte() {
        return steigerungSpalte;
    }
}
