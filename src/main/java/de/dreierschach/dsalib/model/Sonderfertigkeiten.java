package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.Sonderfertigkeit;

import java.util.HashSet;
import java.util.Set;

public class Sonderfertigkeiten {
    private Set<Sonderfertigkeit> sonderfertigkeiten;

    public Sonderfertigkeiten() {
        this.sonderfertigkeiten = new HashSet<>();
    }

    public boolean hatSonderfertigkeit(Sonderfertigkeit sonderfertigkeit) {
        return sonderfertigkeiten.contains(sonderfertigkeit);
    }

    public Sonderfertigkeiten withSonderfertigkeit(Sonderfertigkeit sonderfertigkeit) {
        sonderfertigkeiten.add(sonderfertigkeit);
        return this;
    }
}
