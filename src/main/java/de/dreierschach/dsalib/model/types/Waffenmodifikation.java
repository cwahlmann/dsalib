package de.dreierschach.dsalib.model.types;

public class Waffenmodifikation {
    private final int at;
    private final int pa;

    public Waffenmodifikation(int at, int pa) {
        this.at = at;
        this.pa = pa;
    }

    public static Waffenmodifikation wm(int at, int pa) {
        return new Waffenmodifikation(at, pa);
    }

    public int getAt() {
        return at;
    }

    public int getPa() {
        return pa;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", at, pa);
    }
}
