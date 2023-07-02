package de.dreierschach.dsalib.model.types;

public enum Stand {
    // TODO
    ADEPTUS("Adeptus");
    private final String bezeichnung;

    Stand(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    }
