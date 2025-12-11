package h1;

public class H1_main {
    public static void main(String[] args) {
        Bruch b = new Bruch(4, 3);
        b.shorten();

        System.out.println("Gekürzter Bruch: " + b.zaehler + "/" + b.nenner);

        Bruch b1 = new Bruch(2, 3);
        Bruch b2 = new Bruch(4, 7);
        System.out.println("Sind b1 und b2 identisch?" + b1.hasSameValueAs(b2));
    }
}
