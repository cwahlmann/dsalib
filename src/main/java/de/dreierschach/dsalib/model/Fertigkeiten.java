package de.dreierschach.dsalib.model;

import de.dreierschach.dsalib.model.types.*;

import java.util.*;

import static de.dreierschach.dsalib.model.types.Eigenschaft.*;
import static de.dreierschach.dsalib.model.types.TalentProbe.probe;

public class Fertigkeiten {
    private final Map<Kampftechnik, Integer> kampftechniken;
    private final Map<Talent, Integer> talente;
    private final Set<Metatalent> metatalente;
    private final Map<Sprache, Integer> sprachen;
    private final Map<Schrift, Integer> schriften;
    public static final TalentProbe PROBE_SPRACHE= probe(KL, IN, CH );
    public static final TalentProbe PROBE_SCHRIFT = probe(KL, KL, FF );

    public Fertigkeiten() {
        this.kampftechniken = new HashMap<>();
        this.talente = new HashMap<>();
        this.metatalente = new HashSet<>();
        this.sprachen = new HashMap<>();
        this.schriften = new HashMap<>();
    }

    public boolean hatKampftechnik(Kampftechnik kampftechnik) {
        return kampftechniken.containsKey(kampftechnik);
    }

    public boolean hatTalent(Talent talent) {
        return talente.containsKey(talent);
    }

    public boolean hatMetatalent(Metatalent metatalent) {
        return metatalente.contains(metatalent);
    }

    public boolean hatSprache(Sprache sprache) {
        return sprachen.containsKey(sprache);
    }

    public boolean hatSchrift(Schrift schrift) {
        return schriften.containsKey(schrift);
    }

    public int getKampftechnik(Kampftechnik key) {
        return Optional.ofNullable(kampftechniken.get(key)).orElse(0);
    }

    public int getTalent(Talent key) {
        return Optional.ofNullable(talente.get(key)).orElse(0);
    }

    public int getSprache(Sprache key) {
        return Optional.ofNullable(sprachen.get(key)).orElse(0);
    }

    public int getSchrift(Schrift key) {
        return Optional.ofNullable(schriften.get(key)).orElse(0);
    }

    public Fertigkeiten withKampftechnik(Kampftechnik kampftechnik, int grad) {
        kampftechniken.put(kampftechnik, grad);
        return this;
    }

    public Fertigkeiten withTalent(Talent talent, int grad) {
        talente.put(talent, grad);
        return this;
    }

    public Fertigkeiten withMetatalent(Metatalent metatalent) {
        metatalente.add(metatalent);
        return this;
    }

    public Fertigkeiten withSprache(Sprache sprache, int grad) {
        sprachen.put(sprache, grad);
        return this;
    }

    public Fertigkeiten withSchrift(Schrift schrift, int grad) {
        schriften.put(schrift, grad);
        return this;
    }
}
