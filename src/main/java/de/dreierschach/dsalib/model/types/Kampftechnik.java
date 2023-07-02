package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.EffektiveBehinderung.eBE;
import static de.dreierschach.dsalib.model.types.KampftechnikKategorie.*;
import static de.dreierschach.dsalib.model.types.SteigerungSpalte.*;
import static de.dreierschach.dsalib.model.types.TalentTyp.BASIS;
import static de.dreierschach.dsalib.model.types.TalentTyp.SPEZIAL;

public enum Kampftechnik {
    ANDERTHALBHAENDER_TECHNIK("Anderthalbhänder", BEW_NAHKAMPF, SPEZIAL, E, eBE(-2)),
    ARMBRUST("Armbrust", FERNKAMPF, SPEZIAL, C, eBE(-5)),
    BELAGERUNGSWAFFEN("Belagerungswaffen", FERNKAMPF, SPEZIAL, D),
    BLASROHR_TECHNIK("Blasrohr", FERNKAMPF, SPEZIAL, D, eBE(-5)),
    BOGEN("Bogen", FERNKAMPF, SPEZIAL, E, eBE(-3)),
    DISKUS_TECHNIK("Diskus", FERNKAMPF, SPEZIAL, D, eBE(-2)),
    DOLCHE("Dolche", BEW_NAHKAMPF, BASIS, D, eBE(-1)),
    FECHTWAFFEN("Fechtwaffen", BEW_NAHKAMPF, SPEZIAL, E, eBE(-1)),
    HIEBWAFFEN("Hiebwaffen", BEW_NAHKAMPF, BASIS, D, eBE(-4)),
    INFANTERIEWAFFEN("Infanteriewaffen", BEW_NAHKAMPF, SPEZIAL, D, eBE(-3)),
    KETTENSTAEBE("Kettenstäbe", BEW_NAHKAMPF, SPEZIAL, E, eBE(-1)),
    KETTENWAFFEN("Kettenwaffen", BEW_NAHKAMPF, SPEZIAL, D, eBE(-3)),
    LANZENREITEN("Lanzenreiten", BEW_KAMPF_AT_TECHNIK, SPEZIAL, E),
    PEITSCHE("Peitsche", BEW_KAMPF_AT_TECHNIK, SPEZIAL, E, eBE(-1)),
    RAUFEN("Raufen", WAFFENLOS, BASIS, C, eBE(0)),
    RINGEN("Ringen", WAFFENLOS, BASIS, D, eBE(0)),
    SAEBEL("Säbel", BEW_NAHKAMPF, BASIS, D, eBE(-2)),
    SCHLEUDER_TECHNIK("Schleuder", FERNKAMPF, SPEZIAL, E, eBE(-2)),
    SCHWERTER("Schwerter", BEW_NAHKAMPF, SPEZIAL, E, eBE(-2)),
    SPEERE("Speere", BEW_NAHKAMPF, SPEZIAL, D, eBE(-3)),
    STAEBE("Stäbe", BEW_NAHKAMPF, SPEZIAL, D, eBE(-2)),
    WURFBEILE("Wurfbeile", FERNKAMPF, SPEZIAL, D, eBE(-2)),
    WURFMESSER_TECHNIK("Wurfmesser", FERNKAMPF, BASIS, C, eBE(-3)),
    WURFSPEERE("Wurfspeere", FERNKAMPF, SPEZIAL, C, eBE(-2)),
    ZWEIHANDFLEGEL("Zweihandflegel", BEW_NAHKAMPF, SPEZIAL, D, eBE(-3)),
    ZEIHANDHIEBWAFFEN("Zweihandhiebwaffen", BEW_NAHKAMPF, SPEZIAL, D, eBE(-3)),
    ZWEIHANDSCHWERTER_SAEBEL("Zweihandschwerter- und säbel", BEW_NAHKAMPF, SPEZIAL, E, eBE(-2)),
    IMPROVISIERT("Improvisiert", FERNKAMPF, BASIS, C, eBE(0)),
    ;
    private final String bezeichnung;
    private final KampftechnikKategorie kategorie;
    private final TalentTyp typ;
    private final SteigerungSpalte steigerungstabelleSpalte;
    private final EffektiveBehinderung effektiveBehinderung;

    Kampftechnik(String bezeichnung, KampftechnikKategorie kategorie, TalentTyp typ, SteigerungSpalte steigerungstabelleSpalte, EffektiveBehinderung effektiveBehinderung) {
        this.bezeichnung = bezeichnung;
        this.kategorie = kategorie;
        this.typ = typ;
        this.steigerungstabelleSpalte = steigerungstabelleSpalte;
        this.effektiveBehinderung = effektiveBehinderung;
    }

    Kampftechnik(String bezeichnung, KampftechnikKategorie kategorie, TalentTyp typ, SteigerungSpalte steigerungSpalte) {
        this.bezeichnung = bezeichnung;
        this.kategorie = kategorie;
        this.typ = typ;
        this.steigerungstabelleSpalte = steigerungSpalte;
        this.effektiveBehinderung = eBE(0, 0);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public KampftechnikKategorie getKategorie() {
        return kategorie;
    }

    public TalentTyp getTyp() {
        return typ;
    }

    public SteigerungSpalte getSteigerungstabelleSpalte() {
        return steigerungstabelleSpalte;
    }

    public EffektiveBehinderung getEffektiveBehinderung() {
        return effektiveBehinderung;
    }
}
