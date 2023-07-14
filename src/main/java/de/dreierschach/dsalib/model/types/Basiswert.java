package de.dreierschach.dsalib.model.types;

import de.dreierschach.dsalib.model.Eigenschaften;
import de.dreierschach.dsalib.model.Sonderfertigkeiten;

import java.util.function.Function;
import java.util.stream.Stream;

import static de.dreierschach.dsalib.model.types.Eigenschaft.*;
import static de.dreierschach.dsalib.model.types.Sonderfertigkeit.KAMPFGESPUEHR;
import static de.dreierschach.dsalib.model.types.Sonderfertigkeit.KAMPFREFLEXE;

public enum Basiswert {
    LE("Lebenspunkte", "(MU+KO+KK)/2 ", (e, s, g) -> runden(e, 2, KO, KO, KK), e -> runden(e, 2, KO)),
    AU("Ausdauer", "(MU+KO+GE)/2", (e, s, g) -> runden(e, 2, MU, KO, GE), e -> e.getWert(KO).getStart()),
    AsP("Astralenergie", "(MU+IN+CH)/2", (e, s, g) -> runden(e, 2, MU, IN, CH), e -> e.getWert(MU).getStart()),
    KA("Karmalenergie", "", (e, s, g) -> 0, e -> e.getLeitEigenschaft() != null ? e.getWert(e.getLeitEigenschaft()).getStart() + 3 : 0),
    MR("Magieresistenz", "(MU+KL+KO)/5", (e, s, g) -> runden(e, 5, MU, KL, KO), e -> runden(e, 2, MU)),
    INI("Initiative-Basiswert", "(MU+MU+IN+GE)/5", (e, s, g) -> runden(e, 5, MU, MU, IN, GE) + sonderfertigkeitBonus(s, KAMPFGESPUEHR, 2) + sonderfertigkeitBonus(s, KAMPFREFLEXE, 4), e -> 0),
    AT("Attacke-Basiswert", "(MU+GE+KK)/5", (e, s, g) -> runden(e, 5, MU, GE, KK), e -> 0),
    PA("Parade-Basiswert", "(IN+GE+KK)/5", (e, s, g) -> runden(e, 5, IN, GE, KK), e -> 0),
    FK("Fernkampf-Basiswert", "(IN+FF+KK)/5", (e, s, g) -> runden(e, 5, IN, FF, KK), e -> 0),
    WS("Wundschwelle", "(KO/2)", (e, s, g) -> runden(e, 2, KO), e -> 0);
    private final String bezeichnung;
    private final String kommentar;
    private final BasiswertBerechnung berechnung;
    private final Function<Eigenschaften, Integer> berechnungMaxZugekauft;

    Basiswert(String bezeichnung, String kommentar, BasiswertBerechnung berechnung, Function<Eigenschaften, Integer> berechnungMaxZugekauft) {
        this.bezeichnung = bezeichnung;
        this.kommentar = kommentar;
        this.berechnung = berechnung;
        this.berechnungMaxZugekauft = berechnungMaxZugekauft;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getKommentar() {
        return kommentar;
    }

    public BasiswertBerechnung getBerechnung() {
        return berechnung;
    }

    public Function<Eigenschaften, Integer> getBerechnungMaxZugekauft() {
        return berechnungMaxZugekauft;
    }

    private static int runden(Eigenschaften eigenschaften, int teiler, Eigenschaft... relevanteEigenschaften) {
        var summe = Stream.of(relevanteEigenschaften).map(eigenschaften::getWert).map(Eigenschaftswert::getStart).mapToInt(Integer::intValue).sum();
        return (int) ((float) summe / teiler + 0.5f);
    }

    private static int sonderfertigkeitBonus(Sonderfertigkeiten sonderfertigkeiten, Sonderfertigkeit sonderfertigkeit, int bonus) {
        return sonderfertigkeiten.hatSonderfertigkeit(sonderfertigkeit) ? bonus : 0;
    }
}
