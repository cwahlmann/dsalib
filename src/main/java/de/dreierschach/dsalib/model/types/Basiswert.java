package de.dreierschach.dsalib.model.types;

import de.dreierschach.dsalib.model.Eigenschaften;
import de.dreierschach.dsalib.model.Sonderfertigkeiten;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

import static de.dreierschach.dsalib.model.types.Eigenschaft.*;
import static de.dreierschach.dsalib.model.types.Sonderfertigkeit.KAMPFGESPUEHR;
import static de.dreierschach.dsalib.model.types.Sonderfertigkeit.KAMPFREFLEXE;

public enum Basiswert {
    LE("Lebenspunkte", (e, s) -> runden(e, 2, KO, KO, KK), e -> runden(e, 2, KO)),
    AU("Ausdauer", (e, s) -> runden(e, 2, MU, KO, GE), e -> e.getAktuell(KO)),
    AE("Astralenergie", (e, s) -> runden(e, 2, MU, IN, CH), e -> e.getAktuell(MU)),
    KA("Karmalenergie", (e, s) -> 0, e -> 99),
    MR("Magieresistenz", (e, s) -> runden(e, 5, MU, KL, KO), e -> 99),
    INI("Initiative-Basiswert", (e, s) -> runden(e, 5, MU, MU, IN, GE) + sonderfertigkeitBonus(s, KAMPFGESPUEHR, 2) + sonderfertigkeitBonus(s, KAMPFREFLEXE, 4), e -> 0),
    AT("Attacke-Basiswert", (e, s) -> runden(e, 5, MU, GE, KK), e -> 0),
    PA("Parade-Basiswert", (e, s) -> runden(e, 5, IN, GE, KK), e -> 0),
    FK("Fernkampf-Basiswert", (e, s) -> runden(e, 5, IN, FF, KK), e -> 0),
    WS("Wundschwelle", (e, s) -> runden(e, 2, KO), e -> 0);
    private final String bezeichnung;
    private final BiFunction<Eigenschaften, Sonderfertigkeiten, Integer> berechnung;
    private final Function<Eigenschaften, Integer> berechnungMaxZugekauft;

    Basiswert(String bezeichnung, BiFunction<Eigenschaften, Sonderfertigkeiten, Integer> berechnung, Function<Eigenschaften, Integer> berechnungMaxZugekauft) {
        this.bezeichnung = bezeichnung;
        this.berechnung = berechnung;
        this.berechnungMaxZugekauft = berechnungMaxZugekauft;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public BiFunction<Eigenschaften, Sonderfertigkeiten, Integer> getBerechnung() {
        return berechnung;
    }

    public Function<Eigenschaften, Integer> getBerechnungMaxZugekauft() {
        return berechnungMaxZugekauft;
    }

    private static int runden(Eigenschaften eigenschaften, int teiler, Eigenschaft... relevanteEigenschaften) {
        var summe = Stream.of(relevanteEigenschaften).map(eigenschaften::getAktuell).mapToInt(Integer::intValue).sum();
        return (int) (((float) summe + 0.5f) / 2);
    }

    private static int sonderfertigkeitBonus(Sonderfertigkeiten sonderfertigkeiten, Sonderfertigkeit sonderfertigkeit, int bonus) {
        return sonderfertigkeiten.hatSonderfertigkeit(sonderfertigkeit) ? bonus : 0;
    }
}
