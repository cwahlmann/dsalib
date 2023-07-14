package de.dreierschach.dsalib.model.types;

import de.dreierschach.dsalib.model.Eigenschaften;
import de.dreierschach.dsalib.model.Grundeigenschaften;
import de.dreierschach.dsalib.model.Sonderfertigkeiten;

public class BasiswertWert {
    private Basiswert basiswert;
    private int zugekauft;

    public Basiswert getBasiswert() {
        return basiswert;
    }

    public int getZugekauft() {
        return zugekauft;
    }

    public BasiswertWert withBasiswert(Basiswert basiswert) {
        this.basiswert = basiswert;
        return this;
    }

    public BasiswertWert withZugekauft(int zugekauft) {
        this.zugekauft = zugekauft;
        return this;
    }
    public int start(Eigenschaften eigenschaften, Sonderfertigkeiten sonderfertigkeiten, Grundeigenschaften grundeigenschaften) {
        return basiswert.getBerechnung().apply(eigenschaften, sonderfertigkeiten, grundeigenschaften);
    }
}
