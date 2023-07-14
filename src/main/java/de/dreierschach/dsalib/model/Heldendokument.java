package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.*;

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

    public int getMod(Basiswert basiswert) {
        var vorteileMod = getVorteileNachteile().getVorteile().map(Vorteil::getMods).map(mods -> mods.getMod(basiswert)).findAny().orElse(0);
        var nachteileMod = getVorteileNachteile().getNachteile().map(Nachteil::getMods).map(mods -> mods.getMod(basiswert)).findAny().orElse(0);
        var rasseMod = getGrundeigenschaften().getRasse().getMods().getMod(basiswert);
        var kulturMod = getGrundeigenschaften().getKultur().getMods().getMod(basiswert);
        var professionMod = getGrundeigenschaften().getProfession().getMods().getMod(basiswert);
        var sonderfertigkeitenMod = getSonderfertigkeiten().getSonderfertigkeiten().map(Sonderfertigkeit::getMods).map(mods -> mods.getMod(basiswert)).findAny().orElse(0);
        return vorteileMod + nachteileMod + rasseMod + kulturMod + professionMod + sonderfertigkeitenMod;
    }

    public int getMod(Eigenschaft eigenschaft) {
        var vorteileMod = getVorteileNachteile().getVorteile().map(Vorteil::getMods).map(mods -> mods.getMod(eigenschaft)).findAny().orElse(0);
        var nachteileMod = getVorteileNachteile().getNachteile().map(Nachteil::getMods).map(mods -> mods.getMod(eigenschaft)).findAny().orElse(0);
        var rasseMod = getGrundeigenschaften().getRasse().getMods().getMod(eigenschaft);
        var kulturMod = getGrundeigenschaften().getKultur().getMods().getMod(eigenschaft);
        var professionMod = getGrundeigenschaften().getProfession().getMods().getMod(eigenschaft);
        var sonderfertigkeitenMod = getSonderfertigkeiten().getSonderfertigkeiten().map(Sonderfertigkeit::getMods).map(mods -> mods.getMod(eigenschaft)).findAny().orElse(0);
        return vorteileMod + nachteileMod + rasseMod + kulturMod + professionMod + sonderfertigkeitenMod;
    }

    public int getMod(Talent talent) {
        var vorteileMod = getVorteileNachteile().getVorteile().map(Vorteil::getMods).map(mods -> mods.getMod(talent)).findAny().orElse(0);
        var nachteileMod = getVorteileNachteile().getNachteile().map(Nachteil::getMods).map(mods -> mods.getMod(talent)).findAny().orElse(0);
        var rasseMod = getGrundeigenschaften().getRasse().getMods().getMod(talent);
        var kulturMod = getGrundeigenschaften().getKultur().getMods().getMod(talent);
        var professionMod = getGrundeigenschaften().getProfession().getMods().getMod(talent);
        var sonderfertigkeitenMod = getSonderfertigkeiten().getSonderfertigkeiten().map(Sonderfertigkeit::getMods).map(mods -> mods.getMod(talent)).findAny().orElse(0);
        return vorteileMod + nachteileMod + rasseMod + kulturMod + professionMod + sonderfertigkeitenMod;
    }

    public int getMod(Kampftechnik kampftechnik) {
        var vorteileMod = getVorteileNachteile().getVorteile().map(Vorteil::getMods).map(mods -> mods.getMod(kampftechnik)).findAny().orElse(0);
        var nachteileMod = getVorteileNachteile().getNachteile().map(Nachteil::getMods).map(mods -> mods.getMod(kampftechnik)).findAny().orElse(0);
        var rasseMod = getGrundeigenschaften().getRasse().getMods().getMod(kampftechnik);
        var kulturMod = getGrundeigenschaften().getKultur().getMods().getMod(kampftechnik);
        var professionMod = getGrundeigenschaften().getProfession().getMods().getMod(kampftechnik);
        var sonderfertigkeitenMod = getSonderfertigkeiten().getSonderfertigkeiten().map(Sonderfertigkeit::getMods).map(mods -> mods.getMod(kampftechnik)).findAny().orElse(0);
        return vorteileMod + nachteileMod + rasseMod + kulturMod + professionMod + sonderfertigkeitenMod;
    }

    public int getMod(Sprache sprache) {
        var vorteileMod = getVorteileNachteile().getVorteile().map(Vorteil::getMods).map(mods -> mods.getMod(sprache, eigenschaften)).findAny().orElse(0);
        var nachteileMod = getVorteileNachteile().getNachteile().map(Nachteil::getMods).map(mods -> mods.getMod(sprache, eigenschaften)).findAny().orElse(0);
        var rasseMod = getGrundeigenschaften().getRasse().getMods().getMod(sprache, eigenschaften);
        var kulturMod = getGrundeigenschaften().getKultur().getMods().getMod(sprache, eigenschaften);
        var professionMod = getGrundeigenschaften().getProfession().getMods().getMod(sprache, eigenschaften);
        var sonderfertigkeitenMod = getSonderfertigkeiten().getSonderfertigkeiten().map(Sonderfertigkeit::getMods).map(mods -> mods.getMod(sprache, eigenschaften)).findAny().orElse(0);
        return vorteileMod + nachteileMod + rasseMod + kulturMod + professionMod + sonderfertigkeitenMod;
    }

    public int getMod(Schrift schrift) {
        var vorteileMod = getVorteileNachteile().getVorteile().map(Vorteil::getMods).map(mods -> mods.getMod(schrift)).findAny().orElse(0);
        var nachteileMod = getVorteileNachteile().getNachteile().map(Nachteil::getMods).map(mods -> mods.getMod(schrift)).findAny().orElse(0);
        var rasseMod = getGrundeigenschaften().getRasse().getMods().getMod(schrift);
        var kulturMod = getGrundeigenschaften().getKultur().getMods().getMod(schrift);
        var professionMod = getGrundeigenschaften().getProfession().getMods().getMod(schrift);
        var sonderfertigkeitenMod = getSonderfertigkeiten().getSonderfertigkeiten().map(Sonderfertigkeit::getMods).map(mods -> mods.getMod(schrift)).findAny().orElse(0);
        return vorteileMod + nachteileMod + rasseMod + kulturMod + professionMod + sonderfertigkeitenMod;
    }
}
