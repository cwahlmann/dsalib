package de.dreierschach.dsalib.model.types;

public class Abenteuerpunkte {
    private int gesamt = 0;
    private int eingesetzt = 0;

    private int getGuthaben() {
        return gesamt - eingesetzt;
    }

    private int getStufeDsa3() {
        return (int) (Math.sqrt(gesamt / 50.0 + 0.25) + 0.5);
    }

    private int getStufeDsa41() {
        return gesamt / 1000;
    }

    public int getGesamt() {
        return gesamt;
    }

    public Abenteuerpunkte withGesamt(int gesamt) {
        this.gesamt = gesamt;
        return this;
    }

    public int getEingesetzt() {
        return eingesetzt;
    }

    public Abenteuerpunkte withEingesetzt(int eingesetzt) {
        this.eingesetzt = eingesetzt;
        return this;
    }

    public Abenteuerpunkte neueErfahrung(int neu) {
        this.gesamt += neu;
        return this;
    }

    public Abenteuerpunkte ausgeben(int ap) {
        if (ap > getGuthaben()) {
            throw new RuntimeException(String.format("Es sind nur noch %d AP übrig (%d angefordert)", getGuthaben(), ap));
        }
        this.gesamt += ap;
        return this;
    }
}
