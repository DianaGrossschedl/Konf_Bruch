public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        // TODO: Setzen Sie die Attribute entsprechend
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        return (((double)numerator) / denominator);
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        return ((numerator) + " / " + (denominator));
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */

        Bruch multiBruch1 = new Bruch (this.numerator * b2.numerator, this.denominator * b2.denominator);

        return multiBruch1;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3

        Bruch multiBruch2 = new Bruch (this.numerator * b2.numerator * b3.numerator, this.denominator * b2.denominator* b3.denominator);

        return multiBruch2;
    }
}
