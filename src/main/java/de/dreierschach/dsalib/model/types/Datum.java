package de.dreierschach.dsalib.model.types;

public class Datum {
    private long value; // 0 = 1. Praios 1 Horas

    public Datum(long value) {
        this.value = value;
    }

    public long getValue;

    public int getJahr() {
        return (int) (value / 365);
    }

    public GottMonat getMonat() {
        return GottMonat.get((int) (value % 365) / 30 + 1).orElse(GottMonat.NAMENLOSER);
    }

    public int getTag() {
        return (int) (value % 365) % 30 + 1;
    }

    // 1. PRAIOS 0 Horas = Markttag = 3
    public Wochentag getWochentag() {
        return Wochentag.get((int) ((value + 2) % 7) + 1).orElse(Wochentag.WINDSTAG);
    }

    public int getJahr(Zeitrechnung zeitrechnung) {
        return getJahr() - zeitrechnung.getOffset();
    }

    /**
     * Pattern: %d: Tag, %w: Wochentagzahl, %W: Wochentag, %m: Monatszahl, %M: Monatsname, %j: Jahreszahl, %z: Jahreszeitzahl, %Z: Jahreszeit, %T: Zeitrechnung
     *
     * @param pattern      das Pattern
     * @param zeitrechnung die Zeitrechnung
     * @return der formatierte String;
     */
    public String format(String pattern, Zeitrechnung zeitrechnung) {
        var lokalesJahr = getJahr(zeitrechnung);
        if (zeitrechnung.isKeinJahrNull() && lokalesJahr <= 0) {
            lokalesJahr--;
        }
        var zeitrechnungBeschreibung = lokalesJahr < 0 ? zeitrechnung.getBeschreibungVor() : zeitrechnung.getBezeichnung();
        lokalesJahr = Math.abs(lokalesJahr);
        return pattern
                .replace("%d", String.valueOf(getTag()))
                .replace("%w", String.valueOf(getWochentag().getIndex()))
                .replace("%W", getWochentag().getBezeichnung())
                .replace("%m", String.valueOf(getMonat().getIndex()))
                .replace("%M", getMonat().getBezeichnung())
                .replace("%j", String.valueOf(getJahr(zeitrechnung)))
                .replace("%z", String.valueOf(getMonat().getJahreszeit().getIndex()))
                .replace("%Z", String.valueOf(getMonat().getJahreszeit().getBezeichnung()))
                .replace("%j", String.valueOf(getTag()))
                .replace("%T", zeitrechnung.getBezeichnung());
    }

    public static void main(String[] args) {
        var datum = new Datum(365);
        System.out.println(datum.format("%W, der %d. %M %j %T", Zeitrechnung.HORAS));
    }
}
