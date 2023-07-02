package de.dreierschach.dsalib.model.types;

import java.util.Set;

import static de.dreierschach.dsalib.model.types.Schrift.*;
import static de.dreierschach.dsalib.model.types.Sprachfamilie.*;
import static de.dreierschach.dsalib.model.types.SteigerungSpalte.A;

public enum Sprache {
    // Garethi
    GARETHI("Garethi", GARETHI_FAMILIE, Set.of(KUSLIKER_ZEICHEN), 18, A),
    BOSPARANO("Bosparano", GARETHI_FAMILIE, Set.of(KUSLIKER_ZEICHEN, IMPERIALE_ZEICHEN), 21, A),
    AURELIANI("Aureliani", GARETHI_FAMILIE, Set.of(KUSLIKER_ZEICHEN), 21, A),
    ZYKLOPAEISCH("Zyklopäisch", GARETHI_FAMILIE, Set.of(KUSLIKER_ZEICHEN), 18, A),

    // Tilamidya
    TULAMIDA("Tulamidya", TULAMIDYA_FAMILIE, Set.of(TULAMIDYA_SCHRIFT, GEHEILIGTE_GLYPHEN_VON_UNAU, KUSLIKER_ZEICHEN), 18, A),
    UR_TULAMIDYA("Ur-Tulamidya", TULAMIDYA_FAMILIE, Set.of(TULAMIDYA_SCHRIFT, UR_TULAMIDYA_SCHRIFT, CHRMK), 21, A),
    ZELAMJA("Zelemja", TULAMIDYA_FAMILIE, Set.of(CHRMK), 18, A),
    ALAANI("ALAANI", TULAMIDYA_FAMILIE, Set.of(KUSLIKER_ZEICHEN, ALTES_ALAANI), 21, A),
    ZHULCHAMMAQRA_TROLLZACKISCH("Zhulchammaqra (Trollzackisch)", TULAMIDYA_FAMILIE, Set.of(), 15, A),
    FERKINA("Ferkina", TULAMIDYA_FAMILIE, Set.of(), 16, A),
    RUUZ_UR_MARASKANISCH("Ruuz ('Ur-Maraskanisch')", TULAMIDYA_FAMILIE, Set.of(UR_TULAMIDYA_SCHRIFT), 18, A),
    ALTES_KEMI("Altes Kemi", TULAMIDYA_FAMILIE, Set.of(ALTES_KEMI_SCHRIFT), 18, A),
    RABENSPRACHE("Rabensprache", TULAMIDYA_FAMILIE, Set.of(KUSLIKER_ZEICHEN, TULAMIDYA_SCHRIFT), 15, A),

    // Thorwalsch
    THORWALSCH("Thorwalsch", THORWALSCH_FAMILIE, Set.of(KUSLIKER_ZEICHEN), 18, A),
    HJALDINGSCH_SAGA_THORWALSCH("Hjaldingsch ('Saga-Thorwalsch')", THORWALSCH_FAMILIE, Set.of(HJALDINGSCHE_RUNEN), 18, A),

    // Elfisch
    ISDIRA("Isdira", ELFISCH_FAMILIE, Set.of(ISDIRA_SCHRIFT), 21, A),
    ASDHARIA("Asdharia", ELFISCH_FAMILIE, Set.of(ASDHARIA_SCHRIFT), 24, A),

    // Zwergisch
    ROGOLAN("Rogolan", ZWERGISCH_FAMILIE, Set.of(ROGOLAN_RUNEN), 21, A),
    ANGRAM("Angram", ZWERGISCH_FAMILIE, Set.of(ANGRAM_GLYPHEN), 21, A),

    // Orkisch
    OLGHAIJAN("Olghaijan ('Hochorkisch')", ORKISCH_FAMILIE, Set.of(), 15, A),
    OLOARKH("Oloarkh", ORKISCH_FAMILIE, Set.of(), 10, A),

    // Rissoal
    MAHRISCH("Mahrisch", RISSOAL_FAMILIE, Set.of(MAHRISCHE_GLYPHEN), 20, A),
    RISSOAL("Rissoal", RISSOAL_FAMILIE, Set.of(), 20, A),

    // einzelne
    DRACHISCH("Drachisch", EINZELNE_SPRACHEN, Set.of(), 21, A),
    GOBLINISCH("Goblinisch", EINZELNE_SPRACHEN, Set.of(), 12, A),
    GROLMISCH("Grolmisch", EINZELNE_SPRACHEN, Set.of(), 17, A),
    KOBOLDISCH("Koboldisch", EINZELNE_SPRACHEN, Set.of(), 15, A),
    MOLOCHISCH("Molochisch", EINZELNE_SPRACHEN, Set.of(), 17, A),
    NECKERGESANG_GEDANKENBILDER("Neckergesang (18, plus GEDANKENBILDER)", EINZELNE_SPRACHEN, Set.of(), 24, A),
    NUJUKA_NIVESISCH("Nujuka ('Nivesisch')", EINZELNE_SPRACHEN, Set.of(), 15, A),
    RSAHH("Rsahh", EINZELNE_SPRACHEN, Set.of(), 18, A),
    TROLLISCH("Trollisch", EINZELNE_SPRACHEN, Set.of(), 15, A),
    WALDMENSCHEN_SPRACHEN("Waldmenschen-Sprachen ('Mohisch'; Tocamuyae, Puka-Puka)", EINZELNE_SPRACHEN, Set.of(), 15, A),
    Z_LIT("Z'Lit", EINZELNE_SPRACHEN, Set.of(), 17, A),

    // Geheimsprachen
    ZHAYAD("Zhayad", EINZELNE_SPRACHEN, Set.of(ZHAYAD_SCHRIFT), 15, A),
    ATAK("Atak (beinhaltet Kenntnis des Schrift)", EINZELNE_SPRACHEN, Set.of(), 12, A),
    FUECHSISCH("Füchsisch (beinhaltet Kenntnis des Schrift)", EINZELNE_SPRACHEN, Set.of(), 12, A),
    ;
    private final String bezeichnung;
    private final Sprachfamilie sprachfamilie;
    private final Set<Schrift> schriften;
    private final int komplexitaet;
    private final SteigerungSpalte steigerungSpalte;

    Sprache(String bezeichnung, Sprachfamilie sprachfamilie, Set<Schrift> schriften, int komplexitaet, SteigerungSpalte steigerungSpalte) {
        this.bezeichnung = bezeichnung;
        this.sprachfamilie = sprachfamilie;
        this.schriften = schriften;
        this.komplexitaet = komplexitaet;
        this.steigerungSpalte = steigerungSpalte;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Sprachfamilie getSprachfamilie() {
        return sprachfamilie;
    }

    public Set<Schrift> getSchriften() {
        return schriften;
    }

    public int getKomplexitaet() {
        return komplexitaet;
    }

    public SteigerungSpalte getSteigerungSpalte() {
        return steigerungSpalte;
    }
}
