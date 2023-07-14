package de.dreierschach.dsalib.model.types;

import de.dreierschach.dsalib.model.Eigenschaften;
import de.dreierschach.dsalib.model.Grundeigenschaften;
import de.dreierschach.dsalib.model.Sonderfertigkeiten;

public interface BasiswertBerechnung {
    Integer apply(Eigenschaften eigenschaften, Sonderfertigkeiten sonderfertigkeiten, Grundeigenschaften grundeigenschaften);
}
