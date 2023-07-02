package de.dreierschach.dsalib.model.types;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class WaffeBemerkungen extends HashSet<WaffeBemerkung> {
    public WaffeBemerkungen() {
        super();
    }

    public WaffeBemerkungen(Collection<? extends WaffeBemerkung> c) {
        super(c);
    }

    public static WaffeBemerkungen bem(WaffeBemerkung... bemerkungen) {
        return new WaffeBemerkungen(Arrays.stream(bemerkungen).collect(Collectors.toSet()));
    }
}
