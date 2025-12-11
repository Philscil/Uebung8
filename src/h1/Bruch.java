package h1;

public class Bruch {
    int zaehler;
    int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int a, int b) {
        int q = a / b;

        int r = a - q * b;

        while (r > 0) {
            a = b;
            b = r;

            q = a / b;

            r = a - q * b;
        }

        return b;
    }

    public void shorten() {
        int ggt = ggT(zaehler, nenner);
        zaehler = zaehler / ggt;
        nenner = nenner / ggt;
    }

    public boolean hasSameValueAs(Bruch b) {
        int ggt = ggT(zaehler, nenner);
        zaehler = zaehler / ggt;
        nenner = nenner / ggt;

        int ggtB = ggT(b.zaehler, b.nenner);
        b.zaehler = b.zaehler / ggtB;   
        b.nenner = b.nenner / ggtB;

        return (zaehler == b.zaehler) && (nenner == b.nenner);
    }
}
