package de.dreierschach.dsalib.model.types;

public class TrefferpunkteBonusKK {
    private final int min;
    private final int step;

    public TrefferpunkteBonusKK(int min, int step) {
        this.min = min;
        this.step = step;
    }

    public static TrefferpunkteBonusKK tpKK(int min, int step) {
        return new TrefferpunkteBonusKK(min, step);
    }

    public int getBonus(int kk) {
        if (kk < min) {
            return 0;
        }
        return (kk - min) / step + 1;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", min, step);
    }
}
