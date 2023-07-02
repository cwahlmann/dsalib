package de.dreierschach.dsalib.model.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrefferpunkteBonusReichweiten {
    private final List<Integer> reichweiten;
    private final List<Integer> tpBoni;

    private TrefferpunkteBonusReichweiten(Integer... reichweitenArray) {
        reichweiten = Arrays.stream(reichweitenArray).collect(Collectors.toList());
        tpBoni = new ArrayList<>();
    }

    public static TrefferpunkteBonusReichweiten reichweiten(Integer... reichweiten) {
        return new TrefferpunkteBonusReichweiten(reichweiten);
    }

    public TrefferpunkteBonusReichweiten tp(Integer... tpBoniArray) {
        tpBoni.addAll(Arrays.stream(tpBoniArray).toList());
        return this;
    }

    public List<Integer> getReichweiten() {
        return reichweiten;
    }

    public List<Integer> getTpBoni() {
        return tpBoni;
    }
}
