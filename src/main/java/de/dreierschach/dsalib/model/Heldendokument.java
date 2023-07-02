package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.Abenteuerpunkte;

public class Heldendokument {
    private final Grundeigenschaften grundeigenschaften = new Grundeigenschaften();
    private final Eigenschaften eigenschaften = new Eigenschaften();
    private final Basiswerte basiswerte = new Basiswerte();
    private final Sonderfertigkeiten sonderfertigkeiten = new Sonderfertigkeiten();
    private final VorteileNachteile vorteileNachteile = new VorteileNachteile();
    private final Fertigkeiten fertigkeiten = new Fertigkeiten();
    private final Abenteuerpunkte abenteuerpunkte = new Abenteuerpunkte();

    public Grundeigenschaften getGrundeigenschaften() {
        return grundeigenschaften;
    }

    public Eigenschaften getEigenschaften() {
        return eigenschaften;
    }

    public Basiswerte getBasiswerte() {
        return basiswerte;
    }

    public Sonderfertigkeiten getSonderfertigkeiten() {
        return sonderfertigkeiten;
    }

    public VorteileNachteile getVorteileNachteile() {
        return vorteileNachteile;
    }

    public Fertigkeiten getFertigkeiten() {
        return fertigkeiten;
    }

    public Abenteuerpunkte getAbenteuerpunkte() {
        return abenteuerpunkte;
    }
}
