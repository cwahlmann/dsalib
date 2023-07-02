package de.dreierschach.dsalib.model.types;

import java.util.Arrays;
import java.util.Optional;

public enum GottMonat {
    PRAIOS(1, "Praios", "Juli", Jahreszeit.SOMMER, 30),
    RONDRA(2, "Rondra", "August", Jahreszeit.SOMMER, 30),
    EFFERD(3, "Efferd", "September", Jahreszeit.HERBST, 30),
    TRAVIA(4, "Travia", "Oktober", Jahreszeit.HERBST, 30),
    BORON(5, "Boron", "November", Jahreszeit.HERBST, 30),
    HESINDE(6, "Hesinde", "Dezember", Jahreszeit.WINTER, 30),
    FIRUN(7, "Firun", "Januar", Jahreszeit.WINTER, 30),
    TSA(8, "Tsa", "Februar", Jahreszeit.WINTER, 30),
    PHEX(9, "Phex", "März", Jahreszeit.FRUEHLING, 30),
    PERAINE(10, "Peraine", "April", Jahreszeit.FRUEHLING, 30),
    INGERIMM(11, "Ingerimm", "Mai", Jahreszeit.FRUEHLING, 30),
    RAHJA(12, "Rahja", "Juni", Jahreszeit.SOMMER, 30),
    NAMENLOSER(13, "Namenloser", "Juni", Jahreszeit.SOMMER, 5)
    ;

    GottMonat(int index, String bezeichnung, String irdisch, Jahreszeit jahreszeit, int tage) {
        this.index = index;
        this.bezeichnung = bezeichnung;
        this.irdisch = irdisch;
        this.jahreszeit = jahreszeit;
        this.tage = tage;
    }

    private int index;
    private String bezeichnung;
    private String irdisch;
    private Jahreszeit jahreszeit;
    private int tage;

    public int getIndex() {
        return index;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getIrdisch() {
        return irdisch;
    }

    public Jahreszeit getJahreszeit() {
        return jahreszeit;
    }

    public int getTage() {
        return tage;
    }

    public static Optional<GottMonat> get(int index) {
        return Arrays.stream(values()).filter(g -> g.index == index).findAny();
    }
}
