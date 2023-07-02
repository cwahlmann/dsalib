package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.*;

public class Grundeigenschaften {
    private String name;
    private Rasse rasse;
    private Kultur kultur;
    private Profession profession;
    private Geschlecht geschlecht;
    private Datum geburtsdatum;
    private float groesse;
    private float gewicht;
    private Haarfarbe haarfarbe;
    private Augenfarbe augenfarbe;
    private String aussehen;
    private Titel titel;
    private int sozialstatus;
    private String hintergrund;

    public String getName() {
        return name;
    }

    public Grundeigenschaften withName(String name) {
        this.name = name;
        return this;
    }

    public Rasse getRasse() {
        return rasse;
    }

    public Grundeigenschaften withRasse(Rasse rasse) {
        this.rasse = rasse;
        return this;
    }

    public Kultur getKultur() {
        return kultur;
    }

    public Grundeigenschaften withKultur(Kultur kultur) {
        this.kultur = kultur;
        return this;
    }

    public Profession getProfession() {
        return profession;
    }

    public Grundeigenschaften withProfession(Profession profession) {
        this.profession = profession;
        return this;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public Grundeigenschaften withGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
        return this;
    }

    public Datum getGeburtsdatum() {
        return geburtsdatum;
    }

    public Grundeigenschaften withGeburtsdatum(Datum geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
        return this;
    }

    public float getGroesse() {
        return groesse;
    }

    public Grundeigenschaften withGroesse(float groesse) {
        this.groesse = groesse;
        return this;
    }

    public float getGewicht() {
        return gewicht;
    }

    public Grundeigenschaften withGewicht(float gewicht) {
        this.gewicht = gewicht;
        return this;
    }

    public Haarfarbe getHaarfarbe() {
        return haarfarbe;
    }

    public Grundeigenschaften withHaarfarbe(Haarfarbe haarfarbe) {
        this.haarfarbe = haarfarbe;
        return this;
    }

    public Augenfarbe getAugenfarbe() {
        return augenfarbe;
    }

    public Grundeigenschaften withAugenfarbe(Augenfarbe augenfarbe) {
        this.augenfarbe = augenfarbe;
        return this;
    }

    public String getAussehen() {
        return aussehen;
    }

    public Grundeigenschaften withAussehen(String aussehen) {
        this.aussehen = aussehen;
        return this;
    }

    public Titel getTitel() {
        return titel;
    }

    public Grundeigenschaften withTitel(Titel titel) {
        this.titel = titel;
        return this;
    }

    public int getSozialstatus() {
        return sozialstatus;
    }

    public Grundeigenschaften withSozialstatus(int sozialstatus) {
        this.sozialstatus = sozialstatus;
        return this;
    }

    public String getHintergrund() {
        return hintergrund;
    }

    public Grundeigenschaften withHintergrund(String hintergrund) {
        this.hintergrund = hintergrund;
        return this;
    }
}
