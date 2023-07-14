package de.dreierschach.dsalib.model.types;

public class Eigenschaftswert {
    private Eigenschaft eigenschaft;
    private int start;

    public Eigenschaft getEigenschaft() {
        return eigenschaft;
    }

    public Eigenschaftswert withEigenschaft(Eigenschaft eigenschaft) {
        this.eigenschaft = eigenschaft;
        return this;
    }

    public int getStart() {
        return start;
    }

    public Eigenschaftswert withStart(int start) {
        this.start = start;
        return this;
    }
}
