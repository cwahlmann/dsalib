package de.dreierschach.dsalib.model.types;

public class Trefferpunkte {
    private final int anzahlW6;
    private final int bonus;

    public Trefferpunkte(int anzahlW6, int bonus) {
        this.anzahlW6 = anzahlW6;
        this.bonus = bonus;
    }

    public static Trefferpunkte tp(int anzahlW6, int bonus) {
        return new Trefferpunkte(anzahlW6, bonus);
    }

    public static Trefferpunkte tp(int bonus) {
        return new Trefferpunkte(1, bonus);
    }

    public int getAnzahlW6() {
        return anzahlW6;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        var result = new StringBuilder();
        if (anzahlW6 > 1) {
            result.append(String.format("%d", anzahlW6));
        }
        if (anzahlW6 > 0) {
            result.append("W6");
            if (bonus != 0) {
                result.append(String.format("%+d", bonus));
            }
        } else {
            result.append(bonus);
        }
        return result.toString();
    }
}
