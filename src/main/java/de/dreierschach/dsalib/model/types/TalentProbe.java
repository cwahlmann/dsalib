package de.dreierschach.dsalib.model.types;

import de.dreierschach.dsalib.model.Eigenschaften;

public class TalentProbe {
    private final Eigenschaft eigenschaft1;
    private final Eigenschaft eigenschaft2;
    private final Eigenschaft eigenschaft3;

    public TalentProbe(Eigenschaft eigenschaft1, Eigenschaft eigenschaft2, Eigenschaft eigenschaft3) {
        this.eigenschaft1 = eigenschaft1;
        this.eigenschaft2 = eigenschaft2;
        this.eigenschaft3 = eigenschaft3;
    }

    public static TalentProbe probe(Eigenschaft eigenschaft1, Eigenschaft eigenschaft2, Eigenschaft eigenschaft3) {
        return new TalentProbe(eigenschaft1, eigenschaft2, eigenschaft3);
    }

    public Eigenschaft getEigenschaft1() {
        return eigenschaft1;
    }

    public Eigenschaft getEigenschaft2() {
        return eigenschaft2;
    }

    public Eigenschaft getEigenschaft3() {
        return eigenschaft3;
    }
}
