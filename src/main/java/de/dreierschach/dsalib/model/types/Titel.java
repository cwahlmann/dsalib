package de.dreierschach.dsalib.model.types;

public enum Titel {
    // TODO
    EUER_GNADEN("Euer Gnaden");
    private final String bezeichnung;

    Titel(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    }
