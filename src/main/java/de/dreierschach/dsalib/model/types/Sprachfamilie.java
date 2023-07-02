package de.dreierschach.dsalib.model.types;

public enum Sprachfamilie {
    GARETHI_FAMILIE("Garethi-Familie"),
    TULAMIDYA_FAMILIE("Tulamidya-Familie"),
    THORWALSCH_FAMILIE("Thorwalsch-Familie"),
    ELFISCH_FAMILIE("Elfisch-Familie"),
    ZWERGISCH_FAMILIE("Zwergisch-Familie"),
    ORKISCH_FAMILIE("Orkisch-Familie"),
    RISSOAL_FAMILIE("Rissoal-Familie"),
    EINZELNE_SPRACHEN("Einzelne Sprachen"),
    GEHEIMSPRACHEN("Geheimsprachen");
    private final String bezeichnung;

    Sprachfamilie(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
