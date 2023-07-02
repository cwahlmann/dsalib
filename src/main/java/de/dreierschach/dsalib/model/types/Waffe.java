package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Distanzklasse.*;
import static de.dreierschach.dsalib.model.types.Distanzklassen.dk;
import static de.dreierschach.dsalib.model.types.Kampftechnik.*;
import static de.dreierschach.dsalib.model.types.Trefferpunkte.tp;
import static de.dreierschach.dsalib.model.types.TrefferpunkteBonusKK.tpKK;
import static de.dreierschach.dsalib.model.types.TrefferpunkteBonusReichweiten.reichweiten;
import static de.dreierschach.dsalib.model.types.WaffeBemerkung.*;
import static de.dreierschach.dsalib.model.types.WaffeBemerkungen.bem;
import static de.dreierschach.dsalib.model.types.Waffenmodifikation.wm;

public enum Waffe {
    // **** NAHKAMPFWAFFEN

    // Anderthalbhänder
    ANDERTHALBHAENDER("Anderthalbhänder", ANDERTHALBHAENDER_TECHNIK, tp(5), tpKK(11, 4), 100, 115, 1, 1, 150, wm(0, 0), bem(Z), dk(N, S)),
    BASTARDSCHWERT("Bastardschwert", ANDERTHALBHAENDER_TECHNIK, tp(5), tpKK(11, 3), 120, 110, 2, 0, 200, wm(0, -1), bem(Z), dk(N)),
    NACHTWIND("Nachtwind", ANDERTHALBHAENDER_TECHNIK, tp(4), tpKK(11, 5), 70, 100, 0, 2, 500, wm(0, 0), bem(Z), dk(N)),
    RONDRAKAMM("Rondrakamm", ANDERTHALBHAENDER_TECHNIK, tp(2, 2), tpKK(12, 3), 130, 130, 1, 0, 0, wm(0, 0), bem(Z, P), dk(N, S)),
    TUZAKMESSER("Tuzakmesser", ANDERTHALBHAENDER_TECHNIK, tp(6), tpKK(12, 4), 100, 130, 1, 1, 400, wm(0, 0), bem(Z), dk(N, S)),

    // Dolche
    BASILISKENZUNGE("Basiliskenzunge", DOLCHE, tp(2), tpKK(12, 4), 25, 30, 4, -1, 70, wm(0, -1), bem(), dk(H)),
    BORNDORN_H("Borndorn", DOLCHE, tp(2), tpKK(12, 5), 30, 40, 1, 0, 40, wm(0, -1), bem(W), dk(H)),
    DOLCH("Dolch", DOLCHE, tp(1), tpKK(12, 5), 20, 30, 2, 0, 20, wm(0, -1), bem(W_), dk(H)),
    DRACHENZAHN("Drachenzahn", DOLCHE, tp(2), tpKK(11, 4), 40, 40, 0, 0, 120, wm(0, 0), bem(), dk(H)),
    EBERFAENGER("Eberfänger", DOLCHE, tp(2), tpKK(12, 4), 40, 40, 1, 0, 60, wm(0, -1), bem(), dk(H)),
    HAKENDOLCH("Hakendolch", DOLCHE, tp(1), tpKK(12, 4), 50, 60, -2, 0, 90, wm(0, 1), bem(), dk(H, N)),
    JAGDMESSER("Jagdmesser", DOLCHE, tp(2), tpKK(12, 5), 15, 30, 3, -1, 50, wm(0, -2), bem(), dk(H)),
    KURZSCHWERT("Kurzschwert", DOLCHE, tp(2), tpKK(11, 4), 40, 50, 1, 0, 80, wm(0, -1), bem(), dk(H, N)),
    LANGDOLCH_DOLCHE("Langdolch", DOLCHE, tp(2), tpKK(12, 4), 30, 40, 1, 0, 45, wm(0, 0), bem(), dk(H)),
    LINKHAND("Linkhand", DOLCHE, tp(1), tpKK(12, 5), 30, 30, 0, 0, 90, wm(0, 1), bem(), dk(H)),
    MENGBILAR("Mengbilar", DOLCHE, tp(1), tpKK(12, 5), 20, 25, 7, -2, 200, wm(0, -3), bem(), dk(H)),
    MESSER("Messer", DOLCHE, tp(0), tpKK(12, 6), 10, 25, 4, -2, 10, wm(-2, -3), bem(I), dk(H)),
    OGERFAENGER("Ogerfänger", DOLCHE, tp(2), tpKK(12, 4), 35, 35, 4, 0, 150, wm(0, -2), bem(), dk(H)),
    SCHEIBENDOLCH("Scheibendolch", DOLCHE, tp(2), tpKK(11, 4), 40, 45, 0, 0, 60, wm(0, -3), bem(), dk(H)),
    SCHWERER_DOLCH("Schwerer Dolch", DOLCHE, tp(2), tpKK(12, 4), 30, 35, 1, 0, 40, wm(0, -1), bem(), dk(H)),
    VULKANGLASDOLCH("Vulkanglasdolch", DOLCHE, tp(-1), tpKK(12, 5), 30, 30, 6, -2, 0, wm(-2, -3), bem(I), dk(H)),
    WAQQIF("Waqqif", DOLCHE, tp(2), tpKK(12, 5), 35, 45, 2, -2, 60, wm(-1, -3), bem(), dk(H)),
    WURFDOLCH_H("Wurfdolch", DOLCHE, tp(1), tpKK(12, 5), 20, 25, 2, -1, 30, wm(-1, -2), bem(W, I_), dk(H)),
    WURFMESSER_H("Wurfmesser", DOLCHE, tp(-1), tpKK(12, 6), 10, 20, 2, -1, 15, wm(-2, -3), bem(W, I_), dk(H)),

    // Fechtwaffen
    DEGEN("Degen", FECHTWAFFEN, tp(3), tpKK(12, 5), 40, 90, 3, 2, 150, wm(0, -1), bem(), dk(N)),
    FLORETT("Florett", FECHTWAFFEN, tp(3), tpKK(13, 5), 30, 90, 4, 3, 180, wm(1, -1), bem(), dk(N)),
    LANGDOLCH_FECHTEN("Langdolch", FECHTWAFFEN, tp(2), tpKK(12, 4), 30, 40, 1, 0, 45, wm(0, 0), bem(), dk(H)),
    MAGIERDEGEN("Magierdegen", FECHTWAFFEN, tp(2), tpKK(13, 5), 30, 75, 4, 1, 150, wm(0, -2), bem(), dk(N)),
    PANZERSTECHER("Panzerstecher", FECHTWAFFEN, tp(4), tpKK(13, 3), 80, 90, 0, 0, 120, wm(-1, -1), bem(), dk(N)),
    RAPIER("Rapier", FECHTWAFFEN, tp(3), tpKK(12, 4), 45, 90, 2, 1, 120, wm(0, 0), bem(), dk(N)),
    ROBBENTOETER("Robbentöter", FECHTWAFFEN, tp(3), tpKK(12, 4), 70, 90, 2, 0, 200, wm(0, 0), bem(), dk(N)),
    STOCKDEGEN("Stockdegen", FECHTWAFFEN, tp(3), tpKK(12, 5), 35, 80, 4, 0, 180, wm(-1, -3), bem(), dk(N)),
    WOLFSMESSER("Wolfsmesser", FECHTWAFFEN, tp(3), tpKK(12, 4), 50, 90, 1, 1, 250, wm(0, 0), bem(), dk(N)),

    // Hiebwaffen
    BACCANAQ_BAKKA("Baccanaq / Bakka", HIEBWAFFEN, tp(4), tpKK(12, 4), 80, 80, 5, -1, 180, wm(0, -2), bem(), dk(N)),
    BEIL("Beil", HIEBWAFFEN, tp(3), tpKK(11, 4), 70, 50, 5, -1, 20, wm(-1, -2), bem(I), dk(N)),
    BRABAKBENGEL("Brabakbengel", HIEBWAFFEN, tp(5), tpKK(13, 3), 120, 90, 1, 0, 100, wm(0, -1), bem(), dk(N)),
    BYAKKA("Byakka", HIEBWAFFEN, tp(5), tpKK(14, 2), 130, 100, 3, -1, 90, wm(0, -1), bem(), dk(N)),
    FACKEL("Fackel", HIEBWAFFEN, tp(0), tpKK(11, 5), 30, 50, 8, -2, 0.5, wm(-2, -3), bem(I), dk(H, N)),
    FLEICHERBEIL("Fleischerbeil", HIEBWAFFEN, tp(2), tpKK(11, 4), 60, 30, 2, -1, 20, wm(-2, -3), bem(I), dk(H)),
    HAUMESSER("Haumesser", HIEBWAFFEN, tp(3), tpKK(13, 3), 90, 50, 3, -1, 40, wm(0, -2), bem(I), dk(H, N)),
    KEULE("Keule", HIEBWAFFEN, tp(2), tpKK(11, 3), 100, 80, 3, 0, 15, wm(0, -2), bem(), dk(N)),
    KNOCHENKEULE("Knochenkeule", HIEBWAFFEN, tp(3), tpKK(11, 3), 110, 100, 3, 0, 0, wm(0, -1), bem(), dk(N)),
    KNUEPPEL("Knüppel", HIEBWAFFEN, tp(1), tpKK(11, 4), 60, 80, 6, 0, 1, wm(0, -2), bem(), dk(N)),
    KRIEGSFAECHER("Kriegsfächer", HIEBWAFFEN, tp(2), tpKK(12, 5), 50, 40, 3, 0, 250, wm(0, 1), bem(), dk(H)),
    LINDWURMSCHLAEGER("Lindwurmschläger", HIEBWAFFEN, tp(4), tpKK(11, 3), 95, 50, 1, -1, 120, wm(0, -1), bem(), dk(H, N)),
    MOLOKDESCHNAJA("Molokdeschnaja", HIEBWAFFEN, tp(4), tpKK(11, 3), 100, 100, 3, 0, 90, wm(0, 0), bem(), dk(N)),
    ORKNASE("Orknase", HIEBWAFFEN, tp(5), tpKK(13, 3), 110, 100, 4, -1, 75, wm(0, -1), bem(), dk(N)),
    RABENSCHNABEL("Rabenschnabel", HIEBWAFFEN, tp(4), tpKK(10, 4), 90, 110, 3, 0, 130, wm(0, 0), bem(), dk(N)),
    SCHMIEDEHAMMER("Schmiedehammer", HIEBWAFFEN, tp(4), tpKK(14, 2), 150, 90, 1, -1, 0, wm(-1, -1), bem(P), dk(N)),
    SICHEL("Sichel", HIEBWAFFEN, tp(2), tpKK(12, 5), 30, 50, 6, -1, 25, wm(-2, -2), bem(I), dk(H)),
    SKRAJA("Skraja", HIEBWAFFEN, tp(3), tpKK(11, 3), 90, 70, 4, 0, 50, wm(0, 0), bem(), dk(N)),
    SONNENZEPTER("Sonnenzepter", HIEBWAFFEN, tp(3), tpKK(12, 3), 90, 70, 1, 0, 0, wm(-1, -1), bem(P), dk(N)),
    STREITAXT("Streitaxt", HIEBWAFFEN, tp(4), tpKK(13, 2), 120, 90, 2, 0, 50, wm(0, -1), bem(), dk(N)),
    STREITKOLBEN("Streitkolben", HIEBWAFFEN, tp(4), tpKK(11, 3), 120, 75, 1, 0, 50, wm(0, -1), bem(), dk(N)),
    STUHLBEIN("Stuhlbein", HIEBWAFFEN, tp(0), tpKK(11, 5), 40, 40, 8, -1, 0, wm(-1, -1), bem(I), dk(H, N)),
    WURFBEIL_H("Wurfbeil", HIEBWAFFEN, tp(3), tpKK(10, 4), 50, 40, 2, -1, 35, wm(0, -2), bem(W, I_), dk(H)),
    WURFKEULE_H("Wurfkeule", HIEBWAFFEN, tp(2), tpKK(12, 5), 35, 40, 3, -1, 18, wm(-1, -1), bem(W, I_), dk(H)),
    ZWERGENSKRAJA("Zwergenskraja", HIEBWAFFEN, tp(3), tpKK(11, 3), 80, 60, 1, 0, 100, wm(0, 0), bem(), dk(H, N)),

    // TODO

    // Infanteriewaffen
    // Kettenstäbe
    // Kettenwaffen
    // Peitsche
    // Säbel
    // Schwerter
    // Speere
    // Stäbe
    // Zweihand-Hiebwaffen
    // Zweihandschwerter / -Säbel
    // Handgemenge-Wafffen (Raufen)

    // **** SCHUSS- UND WURFWAFFEN
    // Blasrohr
    BLASROHR("Blasrohr", BLASROHR_TECHNIK, tp(-1), reichweiten(2, 5, 10, 20, 40).tp(0, 0, 0, -2), 15, 2, 40),

    // Wurfmesser
    BORNDORN("Borndorn", WURFMESSER_TECHNIK, tp(2), reichweiten(2, 4, 6, 8, 15).tp(1, 0, 0, 0, -1), 30, 0, 40),
    DOLCH_F("Dolch", WURFMESSER_TECHNIK, tp(0), reichweiten(1, 3, 5, 7, 10).tp(0, 0, -1, -1), 20, 0, 20),
    WURFDOLCH("Wurfdolch", WURFMESSER_TECHNIK, tp(1), reichweiten(2, 4, 6, 8, 15).tp(1, 0, 0, -1), 20, 0, 30),
    WURFMESSER("Wurfmesser", WURFMESSER_TECHNIK, tp(0), reichweiten(2, 4, 6, 8, 15).tp(1, 0, 0, 0, -1), 10, 0, 15),
    WURFSCHEIBE_RING("Wurfscheibe, -ring", WURFMESSER_TECHNIK, tp(1), reichweiten(2, 4, 8, 12, 20).tp(1, 0, 0, 0, 0), 10, 0, 35),

    // Wurfspeere
    DSCHADRA("Dschadra", WURFSPEERE, tp(4), reichweiten(5, 10, 15, 25, 40).tp(3, 2, 1, 0, 0), 80, 0, 120),
    EFFERDBART("Efferdbart", WURFSPEERE, tp(3), reichweiten(3, 6, 10, 15, 25).tp(2, 1, 0, -1, -2), 90, 0, 80),
    GRANATAPFEL("Granatapfel", WURFSPEERE, tp(4, 0), reichweiten(0, 5, 10, 15, 20).tp(0, 0, 0, 0, 0), 40, 0, 0),
    HOLZSPEER("Holzspeer", WURFSPEERE, tp(2), reichweiten(5, 10, 15, 25, 40).tp(1, 0, 0, -1, -2), 60, 0, 10),
    SPEER("Speer", WURFSPEERE, tp(3), reichweiten(5, 10, 15, 25, 40).tp(1, 0, 0, -1, -2), 80, 0, 30),
    SPEERSCHLEUDER("Speerschleuder", WURFSPEERE, tp(3), reichweiten(15, 30, 60, 100).tp(1, 0, 0, -1), 90, 2, 40),
    STAABSCHLEUDER("Staabschleuder", WURFSPEERE, tp(3), reichweiten(5, 20, 40, 60).tp(0, 0, 0, 0), 43, 2, 15),
    WURFSPEER("Wurfspeer", WURFSPEERE, tp(4), reichweiten(5, 10, 15, 25, 40).tp(3, 1, 0, -1, -1), 80, 0, 30),

    // Wurfbeil
    SCHNEIDZAHN("Schneidzahl", WURFBEILE, tp(4), reichweiten(5, 1, 15, 30).tp(1, 1, 0, -1), 50, 0, 60),
    WURFBEIL("Wurfbeil", WURFBEILE, tp(3), reichweiten(5, 10, 15, 25).tp(1, 1, 0, -1), 60, 0, 35),
    WURFKEULE("Wurfkeule", WURFBEILE, tp(2, 4), reichweiten(5, 15, 25, 40).tp(1, 1, 1, 0), 35, 0, 18),

    // Armbrust
    ARBALETTE("Arbalette", ARMBRUST, tp(2, 5), reichweiten(10, 20, 30, 60, 100).tp(2, 1, 0, -1, -2), 200, 30, 600),
    ARBALONE("Arbalone", ARMBRUST, tp(3, 6), reichweiten(15, 30, 60, 120, 250).tp(4, 2, 0, -1, -3), 480, 40, 800),
    BALESTRA("Balestra", ARMBRUST, tp(2, 2), reichweiten(10, 20, 30, 50, 60).tp(2, 1, 0, 0, -1), 150, 12, 500),
    BALESTRINA("Balestrina", ARMBRUST, tp(4), reichweiten(2, 4, 8, 15, 25).tp(2, 1, 0, 0, -1), 60, 4, 450),
    BALLAESTER("Balläster", ARMBRUST, tp(4), reichweiten(10, 20, 30, 60, 100).tp(3, 1, 0, -1, -1), 120, 8, 200),
    EISENWALDER("Eisenwalder", ARMBRUST, tp(3), reichweiten(5, 10, 15, 20, 40).tp(1, 0, 0, 0, -1), 200, 3, 400),
    LEICHTE_ARMBRUST("Leichte Armbrust", ARMBRUST, tp(6), reichweiten(10, 15, 25, 40, 60).tp(1, 1, 0, 0, -1), 150, 15, 180),
    WINDENARMBRUST("Windenarmbrust", ARMBRUST, tp(2, 6), reichweiten(10, 30, 60, 100, 180).tp(4, 2, 0, -1, -3), 200, 30, 350),

    // Bogen
    ELFENBOGEN("Elfenbogen", BOGEN, tp(5), reichweiten(10, 25, 50, 100, 200).tp(3, 2, 1, 1, 0), 25, 3, 0),
    KOMPOSITBOGEN("Kompositbogen", BOGEN, tp(5), reichweiten(10, 20, 35, 50, 80).tp(2, 1, 1, 0, 0), 35, 3, 80),
    KRIEGSBOGEN("Kriegsbogen", BOGEN, tp(7), reichweiten(10, 20, 40, 80, 150).tp(3, 2, 1, 0, 0), 45, 4, 100),
    KURZBOGEN("Kurzbogen", BOGEN, tp(4), reichweiten(5, 15, 25, 40, 60).tp(1, 1, 0, 0, -1), 20, 2, 45),
    LANGBOGEN("Langbogen", BOGEN, tp(6), reichweiten(10, 25, 50, 100, 200).tp(3, 2, 1, 0, -1), 30, 4, 60),
    ORK_REITERBOGEN("Ork. Reiterbogen", BOGEN, tp(5), reichweiten(5, 15, 30, 60, 100).tp(3, 1, 0, -1, -2), 40, 3, 120),

    // Schleuder
    FLEDERMAUS("Fledermaus", SCHLEUDER_TECHNIK, tp(2), reichweiten(5, 10, 15, 25).tp(0, 0, 0, -1), 20, 1, 10),
    GRANATAPFEL_F("Granatapfel", SCHLEUDER_TECHNIK, tp(4, 0), reichweiten(5, 10, 15, 20).tp(0, 0, 0, 0), 40, 0, 0),
    KETTENKUGEL("Kettenkugel", SCHLEUDER_TECHNIK, tp(2, 2), reichweiten(2, 5, 8, 15).tp(1, 0, 0, 0), 250, 2, 150),
    LASSO("Lasso", SCHLEUDER_TECHNIK, tp(4), reichweiten(2, 5, 10, 15).tp(0, 0, -1, -2), 40, 1, 12),
    SCHLEUDER("Schleuder", SCHLEUDER_TECHNIK, tp(2), reichweiten(5, 12, 25, 40).tp(0, 0, 0, 0), 10, 2, 15),
    WURFNETZ("Wurfnetz", SCHLEUDER_TECHNIK, tp(2), reichweiten(5).tp(0), 80, 1, 35),
    SCHWERES_WURFNETZ("Schweres Wurfnetz", SCHLEUDER_TECHNIK, tp(6), reichweiten(5).tp(0), 200, 1, 60),

    // Diskus
    DISKUS("Diskus", DISKUS_TECHNIK, tp(3), reichweiten(5, 10, 20, 30, 60).tp(1, 0, 0, 0, -1), 30, 0, 25),
    JAGDDISKUS("Jagddiskus", DISKUS_TECHNIK, tp(2, 4), reichweiten(5, 10, 20, 30, 60).tp(1, 0, 0, 0, -1), 35, 0, 30),
    KAMPFDISKUS("Kampfdiskus", DISKUS_TECHNIK, tp(5), reichweiten(10, 20, 30, 45, 60).tp(1, 0, 0, 0, 0), 50, 0, 60),

    // Improvisiert
    STEIN_FLASCHE("Stein, Flasche", IMPROVISIERT, tp(0), reichweiten(1, 2, 4, 8, 12).tp(0, 0, 0, -1, -1), 10, 0, 0),

    ;
    private final String bezeichnung;
    private final Kampftechnik kampftechnik;
    private final Trefferpunkte trefferpunkte;
    private final TrefferpunkteBonusKK trefferpunkteBonusKK;
    private final int gewicht;
    private final int laenge;
    private final int bruchfaktor;
    private final int iniBonus;
    private final double preisST;
    private final Waffenmodifikation waffenmodifikation;
    private final WaffeBemerkungen bemerkungen;
    private final Distanzklassen distanzklassen;
    private final TrefferpunkteBonusReichweiten trefferpunkteBonusReichweiten;
    private final int ladenAktionen;

    // Nahkampfwaffe
    Waffe(String bezeichnung, Kampftechnik kampftechnik, Trefferpunkte trefferpunkte,
          TrefferpunkteBonusKK trefferpunkteBonusKK, int gewicht, int laenge, int bruchfaktor, int iniBonus,
          double preisST, Waffenmodifikation waffenmodifikation, WaffeBemerkungen bemerkungen, Distanzklassen distanzklassen) {
        this.bezeichnung = bezeichnung;
        this.kampftechnik = kampftechnik;
        this.trefferpunkte = trefferpunkte;
        this.trefferpunkteBonusKK = trefferpunkteBonusKK;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.bruchfaktor = bruchfaktor;
        this.iniBonus = iniBonus;
        this.preisST = preisST;
        this.waffenmodifikation = waffenmodifikation;
        this.bemerkungen = bemerkungen;
        this.distanzklassen = distanzklassen;

        this.trefferpunkteBonusReichweiten = null;
        this.ladenAktionen = 0;
    }

    // Fernkampfwaffe
    Waffe(String bezeichnung, Kampftechnik kampftechnik, Trefferpunkte trefferpunkte,
          TrefferpunkteBonusReichweiten trefferpunkteBonusReichweiten, int gewicht, int ladenAktionen, double preisST) {
        this.bezeichnung = bezeichnung;
        this.kampftechnik = kampftechnik;
        this.trefferpunkte = trefferpunkte;
        this.gewicht = gewicht;
        this.preisST = preisST;
        this.trefferpunkteBonusReichweiten = trefferpunkteBonusReichweiten;
        this.ladenAktionen = ladenAktionen;

        this.trefferpunkteBonusKK = new TrefferpunkteBonusKK(0, 0);
        this.laenge = 0;
        this.bruchfaktor = 0;
        this.iniBonus = 0;
        this.waffenmodifikation = new Waffenmodifikation(0, 0);
        this.bemerkungen = bem();
        this.distanzklassen = dk();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Kampftechnik getKampftechnik() {
        return kampftechnik;
    }

    public Distanzklassen getDistanzklassen() {
        return distanzklassen;
    }

    public Trefferpunkte getTrefferpunkte() {
        return trefferpunkte;
    }

    public TrefferpunkteBonusKK getTrefferpunkteBonusKK() {
        return trefferpunkteBonusKK;
    }

    public TrefferpunkteBonusReichweiten getTrefferpunkteBonusEntfernungen() {
        return trefferpunkteBonusReichweiten;
    }

    public int getIniBonus() {
        return iniBonus;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBruchfaktor() {
        return bruchfaktor;
    }

    public double getPreisST() {
        return preisST;
    }

    public WaffeBemerkungen getBemerkungen() {
        return bemerkungen;
    }

    public Waffenmodifikation getWaffenmodifikation() {
        return waffenmodifikation;
    }
}
