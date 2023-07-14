package de.dreierschach.dsalib.model.types;

import javax.print.StreamPrintService;

import static de.dreierschach.dsalib.model.types.EffektiveBehinderung.eBE;
import static de.dreierschach.dsalib.model.types.Eigenschaft.*;
import static de.dreierschach.dsalib.model.types.TalentKategorie.*;
import static de.dreierschach.dsalib.model.types.TalentProbe.probe;
import static de.dreierschach.dsalib.model.types.TalentTyp.BASIS;
import static de.dreierschach.dsalib.model.types.TalentTyp.SPEZIAL;

public enum Talent {
    // Körper
    AKROBATIK("Akrobatik", KOERPER, probe(MU, GE, KK), SPEZIAL, eBE(2, 0)),
    ATHLETIK("Athletik", KOERPER, probe(GE, KO, KK), BASIS, eBE(2, 0)),
    FLIEGEN("Fliegen", KOERPER, probe(MU, IN, GE), SPEZIAL, eBE(1, 0)),
    GAUKELEIEN("Gaukeleien", KOERPER, probe(MU, CH, FF), SPEZIAL, eBE(2, 0)),
    KLETTERN("Klettern", KOERPER, probe(MU, GE, KK), BASIS, eBE(2, 0)),
    KOERPERBEHERRSCHUNG("Körperbeherrschung", KOERPER, probe(MU, GE, KK), SPEZIAL, eBE(2, 0)),
    REITEN("Reiten", KOERPER, probe(CH, GE, KK), SPEZIAL, eBE(-2)),
    SCHLEICHEN("Schleichen", KOERPER, probe(MU, IN, GE), BASIS, eBE(1, 0)),
    SCHWIMMEN("Schwimmen", KOERPER, probe(GE, KO, KK), BASIS, eBE(2, 0)),
    SELBSTBEHERRSCHUNG("Selbstbeherrschung", KOERPER, probe(MU, KO, KK), BASIS),
    SICH_VERSTECKEN("Sich Verstecken", KOERPER, probe(MU, IN, GE), BASIS, eBE(-2)),
    SINGEN("Singen", KOERPER, probe(IN, CH, CH), probe(IN, CH, KO), BASIS, eBE(-3)),
    SINNENSCHAERFE("Sinnenschärfe", KOERPER, probe(KL, IN, IN), probe(KL, IN, FF), BASIS),
    SKIFAHREN("Skifahren", KOERPER, probe(GE, GE, KO), SPEZIAL, eBE(-2)),
    STIMMEN_IMITIEREN("Stimmen Imitieren", KOERPER, probe(KL, IN, CH), SPEZIAL, eBE(-4)),
    TANZEN("Tanzen", KOERPER, probe(CH, GE, GE), BASIS, eBE(2, 0)),
    //lol
    TASCHENDIEBSTAHL("Taschendiebstahl", KOERPER, probe(MU, IN, FF), SPEZIAL, eBE(2, 0)),
    ZECHEN("Zechen", KOERPER, probe(IN, KO, KK), BASIS),

    // Gesellschaft
    BETOEREN("Betören", GESELLSCHAFT, probe(IN, CH, CH), SPEZIAL),
    ETIKETTE("Etikette", GESELLSCHAFT, probe(KL, IN, CH), SPEZIAL),
    GASSENWISSEN("Gassenwissen", GESELLSCHAFT, probe(KL, IN, CH), SPEZIAL),
    LEHREN("Lehren", GESELLSCHAFT, probe(KL, IN, CH), SPEZIAL),
    MENSCHENKENNTNIS("Menschenkenntnis", GESELLSCHAFT, probe(KL, IN, CH), BASIS),
    SCHAUSPIELEREI("Schauspielerei", GESELLSCHAFT, probe(MU, KL, CH), SPEZIAL),
    SCHRIFTLICHER_AUSDRUCK("Schriftlicher Ausdruck", GESELLSCHAFT, probe(KL, IN, IN), SPEZIAL),
    SICH_VERKLEIDEN("Sich Verkleiden", GESELLSCHAFT, probe(MU, CH, GE), SPEZIAL),
    UEBERREDEN("Überreden", GESELLSCHAFT, probe(MU, IN, CH), BASIS),
    UEBERZEUGEN("Überzeugen", GESELLSCHAFT, probe(KL, IN, CH), SPEZIAL),

    // Natur
    FAEHRTENSUCHEN("Fährtensuchen", NATUR, probe(KL, IN, IN), probe(KL, IN, KO), BASIS),
    FALLENSTELLEN("Fallenstellen", NATUR, probe(KL, IN, IN), probe(KL, IN, KO), BASIS),
    FESSELN_ENTFESSELN("Fesseln / Entfesseln", NATUR, probe(FF, GE, KK), SPEZIAL),
    FISCHEN_ANGELN("Fischen / Angeln", NATUR, probe(IN, FF, KK), SPEZIAL),
    ORIENTIERUNG("Orientierung", NATUR, probe(KL, IN, IN), BASIS),
    WETTERVORHERSAGE("Wettervorhersage", NATUR, probe(KL, IN, IN), SPEZIAL),
    WILDNISLEBEN("Wildnisleben", NATUR, probe(IN, GE, KO), BASIS),

    // Wissen
    ANATOMIE("Anatomie", WISSEN, probe(MU, KL, FF), SPEZIAL),
    BAUKUNST("Baukunst", WISSEN, probe(KL, KL, FF), SPEZIAL),
    BRETTSPIEL("Brettspiel", WISSEN, probe(KL, KL, IN), SPEZIAL),
    GEOGRAPHIE("Geographie", WISSEN, probe(KL, KL, IN), SPEZIAL),
    GESCHICHTSWISSEN("Geschichtswissen", WISSEN, probe(KL, KL, IN), SPEZIAL),
    GESTEINSKUNDE("Gesteinskunde", WISSEN, probe(KL, IN, FF), SPEZIAL),
    GOETTER_KULTE("Götter / Kulte", WISSEN, probe(KL, KL, IN), SPEZIAL),
    HERALDIK("Heraldik", WISSEN, probe(KL, KL, FF), SPEZIAL),
    HUETTENKUNDE("Hüttenkunde", WISSEN, probe(KL, IN, KO), SPEZIAL),
    KRIEGSKUNST("Kriegskunst", WISSEN, probe(MU, KL, CH), SPEZIAL),
    KRYPTOGRAPHIE("Kryptographie", WISSEN, probe(KL, KL, IN), SPEZIAL),
    MAGIEKUNDE("Magiekunde", WISSEN, probe(KL, KL, IN), SPEZIAL),
    MECHANIK("Mechanik", WISSEN, probe(KL, KL, FF), SPEZIAL),
    PFLANZENKUNDE("Pflanzenkunde", WISSEN, probe(KL, IN, FF), SPEZIAL),
    PHILOSOPHIE("Philosophie", WISSEN, probe(KL, KL, IN), SPEZIAL),
    RECHNEN("Rechnen", WISSEN, probe(KL, KL, IN), BASIS),
    RECHTSKUNDE("Rechtskunde", WISSEN, probe(KL, KL, IN), SPEZIAL),
    SAGEN_LEGENDEN("Sagen / Legenden", WISSEN, probe(KL, IN, CH), BASIS),
    SCHAETZEN("Schätzen", WISSEN, probe(KL, IN, IN), SPEZIAL),
    SPRACHENKUNDE("Sprachenkunde", WISSEN, probe(KL, KL, IN), SPEZIAL),
    STAATSKUNST("Staatskunst", WISSEN, probe(KL, IN, CH), SPEZIAL),
    STERNKUNDE("Sternkunde", WISSEN, probe(KL, KL, IN), SPEZIAL),
    TIERKUNDE("Tierkunde", WISSEN, probe(MU, KL, IN), SPEZIAL),

    // Handwerk
    ABRICHTEN("Abrichten", HANDWERK, probe(MU, IN, CH), SPEZIAL),
    ACKERBAU("Ackerbau", HANDWERK, probe(IN, FF, KO), SPEZIAL),
    ALCHIMIE("Alchimie", HANDWERK, probe(MU, KL, FF), SPEZIAL),
    BERGBAU("Bergbau", HANDWERK, probe(IN, KO, KK), SPEZIAL),
    BOGENBAU("Bogenbau", HANDWERK, probe(KL, IN, FF), SPEZIAL),
    BOOTE_FAHREN("Boote Fahren", HANDWERK, probe(GE, KO, KK), SPEZIAL),
    BRAUER("Brauer", HANDWERK, probe(KL, FF, KK), SPEZIAL),
    DRUCKER("Drucker", HANDWERK, probe(KL, FF, KK), SPEZIAL),
    FAHRZEUG_LENKEN("Fahrzeug Lenken", HANDWERK, probe(IN, CH, FF), SPEZIAL),
    FALSCHSPIEL("Falschspiel", HANDWERK, probe(MU, CH, FF), SPEZIAL),
    FEINMECHANIK("Feinmechanik", HANDWERK, probe(KL, FF, FF), SPEZIAL),
    FEUERSTEINBERBEITUNG("Feuersteinberbeitung", HANDWERK, probe(KL, FF, FF), SPEZIAL),
    FLEISCHER("Fleischer", HANDWERK, probe(KL, FF, KK), SPEZIAL),
    GERBER_KUERSCHNER("Gerber / Kürschner", HANDWERK, probe(KL, FF, KO), SPEZIAL),
    GLASKUNST("Glaskunst", HANDWERK, probe(FF, FF, KO), SPEZIAL),
    GROBSCHMIED("Grobschmied", HANDWERK, probe(FF, KO, KK), SPEZIAL),
    HANDEL("Handel", HANDWERK, probe(KL, IN, CH), SPEZIAL),
    HAUSWIRTSCHAFT("Hauswirtschaft", HANDWERK, probe(IN, CH, FF), SPEZIAL),
    HEILKUNDE_GIFT("Heilkunde Gift", HANDWERK, probe(MU, KL, IN), SPEZIAL),
    HEILKUNDE_KRANKHEITEN("Heilkunde Krankheiten", HANDWERK, probe(MU, KL, CH), SPEZIAL),
    HEILKUNDE_SEELE("Heilkunde Seele", HANDWERK, probe(IN, CH, CH), SPEZIAL),
    HEILKUNDE_WUNDEN("Heilkunde Wunden", HANDWERK, probe(KL, CH, FF), BASIS),
    HOLZBEARBEITUNG("Holzbearbeitung", HANDWERK, probe(KL, FF, KK), BASIS),
    INSTRUMENTENBAUER("Instrumentenbauer", HANDWERK, probe(KL, IN, FF), SPEZIAL),
    KARTOGRAPHIE("Kartographie", HANDWERK, probe(KL, KL, FF), SPEZIAL),
    KOCHEN("Kochen", HANDWERK, probe(KL, IN, FF), SPEZIAL),
    KRISTALLZUCHT("Kristallzucht", HANDWERK, probe(KL, IN, FF), SPEZIAL),
    LEDERARBEITEN("Lederarbeiten", HANDWERK, probe(KL, FF, FF), SPEZIAL),
    MALEN_ZEICHNEN("Malen / Zeichnen", HANDWERK, probe(KL, IN, FF), SPEZIAL),
    MAURER("Maurer", HANDWERK, probe(FF, GE, KK), SPEZIAL),
    METALLGUSS("Metallguss", HANDWERK, probe(KL, FF, KK), SPEZIAL),
    MUSIZIEREN("Musizieren", HANDWERK, probe(IN, CH, FF), SPEZIAL),
    SCHLOESSER_KNACKEN("Schlösser Knacken", HANDWERK, probe(IN, FF, FF), SPEZIAL),
    SCHNAPS_BRENNEN("Schnaps Brennen", HANDWERK, probe(KL, IN, FF), SPEZIAL),
    SCHNEIDERN("Schneidern", HANDWERK, probe(KL, FF, FF), BASIS),
    SEEFAHRT("Seefahrt", HANDWERK, probe(FF, GE, KK), SPEZIAL),
    SEILER("Seiler", HANDWERK, probe(FF, FF, KK), SPEZIAL),
    STEINMETZ("Steinmetz", HANDWERK, probe(FF, FF, KK), SPEZIAL),
    STEINSCHNEIDER_JUWELIER("Steinschneider / Juwelier", HANDWERK, probe(IN, FF, FF), SPEZIAL),
    STELLMACHER("Stellmacher", HANDWERK, probe(KL, FF, KK), SPEZIAL),
    STOFFE_FAERBEN("Stoffe Färben", HANDWERK, probe(KL, FF, KK), SPEZIAL),
    TAETOWIEREN("Tätowieren", HANDWERK, probe(IN, FF, FF), SPEZIAL),
    TOEPFERN("Töpfern", HANDWERK, probe(KL, FF, FF), SPEZIAL),
    VIEWZUCHT("Viehzucht", HANDWERK, probe(KL, IN, CH), SPEZIAL),
    WEBKUNST("Webkunst", HANDWERK, probe(FF, FF, KK), SPEZIAL),
    WINZER("Winzer", HANDWERK, probe(KL, FF, KK), SPEZIAL),
    ZIMMERMANN("Zimmermann", HANDWERK, probe(KL, FF, KK), SPEZIAL);
    private final String bezeichnung;
    private final TalentKategorie kategorie;
    private final TalentProbe talentProbe;
    private final TalentProbe alternativeProbe;
    private final TalentTyp typ;
    private final EffektiveBehinderung effektiveBehinderung;

    Talent(String bezeichnung, TalentKategorie kategorie,
           TalentProbe talentProbe, TalentProbe alternativeProbe,
           TalentTyp typ, EffektiveBehinderung effektiveBehinderung) {
        this.bezeichnung = bezeichnung;
        this.kategorie = kategorie;
        this.talentProbe = talentProbe;
        this.alternativeProbe = alternativeProbe;
        this.typ = typ;
        this.effektiveBehinderung = effektiveBehinderung;
    }

    Talent(String bezeichnung, TalentKategorie kategorie,
           TalentProbe talentProbe, TalentTyp typ, EffektiveBehinderung effektiveBehinderung) {
        this(bezeichnung, kategorie, talentProbe, null, typ, effektiveBehinderung);
    }

    Talent(String bezeichnung, TalentKategorie kategorie,
           TalentProbe talentProbe, TalentProbe alternativeProbe, TalentTyp typ) {
        this(bezeichnung, kategorie, talentProbe, alternativeProbe, typ, eBE(0, 0));
    }

    Talent(String bezeichnung, TalentKategorie kategorie,
           TalentProbe talentProbe, TalentTyp typ) {
        this(bezeichnung, kategorie, talentProbe, null, typ, eBE(0, 0));
    }
}
