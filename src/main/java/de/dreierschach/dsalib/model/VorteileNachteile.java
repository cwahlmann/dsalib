package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.Nachteil;
import de.dreierschach.dsalib.model.types.Sonderfertigkeit;
import de.dreierschach.dsalib.model.types.Vorteil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VorteileNachteile {
    private final Map<Vorteil, Integer> vorteile;
    private final Map<Nachteil, Integer> nachteile;

    public VorteileNachteile() {
        this.vorteile = new HashMap<>();
        this.nachteile = new HashMap<>();
    }

    public boolean hatVorteil(Vorteil vorteil) {
        return vorteile.containsKey(vorteil);
    }

    public VorteileNachteile withVorteil(Vorteil vorteil, int grad) {
        vorteile.put(vorteil, grad);
        return this;
    }

    public boolean hatNachteil(Nachteil nachteil) {
        return nachteile.containsKey(nachteil);
    }

    public VorteileNachteile withNachteil(Nachteil nachteil, int grad) {
        nachteile.put(nachteil, grad);
        return this;
    }
}
