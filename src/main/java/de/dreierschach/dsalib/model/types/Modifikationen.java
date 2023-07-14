package de.dreierschach.dsalib.model.types;

import de.dreierschach.dsalib.model.Eigenschaften;

import java.util.HashMap;
import java.util.Map;

import static de.dreierschach.dsalib.model.types.Eigenschaft.KL;

public class Modifikationen {
    private final Map<Eigenschaft, Integer> eigenschaftsMods = new HashMap<>();
    private final Map<Basiswert, Integer> basiswertMods = new HashMap<>();
    private final Map<Talent, Integer> talentMods = new HashMap<>();
    private final Map<Kampftechnik, Integer> kampftechnikMods = new HashMap<>();
    private final Map<Sprache, Integer> sprachenMods = new HashMap<>();
    private Sprache muttersprache;
    private Sprache zweitsprache;
    private final Map<Schrift, Integer> schriftenMods = new HashMap<>();

    public static Modifikationen mods() {
        return new Modifikationen();
    }

    public Modifikationen mod(Eigenschaft eigenschaft, int mod) {
        eigenschaftsMods.put(eigenschaft, mod);
        return this;
    }

    public Modifikationen mod(Basiswert basiswert, int mod) {
        basiswertMods.put(basiswert, mod);
        return this;
    }

    public Modifikationen mod(Talent talent, int mod) {
        talentMods.put(talent, mod);
        return this;
    }

    public Modifikationen mod(Kampftechnik kampftechnik, int mod) {
        kampftechnikMods.put(kampftechnik, mod);
        return this;
    }

    public Modifikationen mod(Sprache sprache, int mod) {
        sprachenMods.put(sprache, mod);
        return this;
    }

    public Modifikationen mod(Schrift schrift, int mod) {
        schriftenMods.put(schrift, mod);
        return this;
    }

    public Sprache getMuttersprache() {
        return muttersprache;
    }

    public Modifikationen muttersprache(Sprache muttersprache) {
        this.muttersprache = muttersprache;
        return this;
    }

    public Sprache getZweitsprache() {
        return zweitsprache;
    }

    public Modifikationen zweitsprache(Sprache zweitsprache) {
        this.zweitsprache = zweitsprache;
        return this;
    }

    public int getMod(Eigenschaft eigenschaft) {
        return eigenschaftsMods.getOrDefault(eigenschaft, 0);
    }

    public int getMod(Basiswert basiswert) {
        return basiswertMods.getOrDefault(basiswert, 0);
    }

    public int getMod(Talent talent) {
        return talentMods.getOrDefault(talent, 0);
    }

    public int getMod(Kampftechnik kampftechnik) {
        return kampftechnikMods.getOrDefault(kampftechnik, 0);
    }

    public int getMod(Sprache sprache, Eigenschaften eigenschaften) {
        var mod = 0;
        if (sprache == muttersprache) {
            mod = eigenschaften.getWert(KL).getStart() - 2;
        } else if (sprache == zweitsprache) {
            mod = eigenschaften.getWert(KL).getStart() - 4;
        }
        return sprachenMods.getOrDefault(sprache, 0) + mod;
    }

    public int getMod(Schrift schrift) {
        return schriftenMods.getOrDefault(schrift, 0);
    }
}
