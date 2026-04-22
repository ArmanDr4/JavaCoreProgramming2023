package ba.smoki.four.array;

public class ArrayDemo {
    static void main(String[] args) {
        int broj = 23;
        System.out.println(broj);
        broj = 1;
        System.out.println(broj);
        broj = 10;
        System.out.println(broj);

        /**
         * Prvi složeni tip podatka je niz
         * -------------------------------------------------------------------
         * 1. Opcija - zauzmemo memorije koliko nam treba
         * Koliko polja u toj varijabli ili koliko brojeva ću skladištiti
         * u nizu.
         * -------------------------------------------------------------------
         * brojevi -> u njoj mogu biti skladištena 3 broja int tipa
         * 23   1   10
         * _    _   _
         * 0    1   2
         */
        int[] brojevi = new int[3];
        brojevi[0] = 23;
        brojevi[1] = 1;
        brojevi[2] = 10;
        System.out.println("Element na indeksu 0 = " + brojevi[0]);
        System.out.println("Element na indeksu 1 = " + brojevi[1]);
        System.out.println("Element na indeksu 2 = " + brojevi[2]);


        /* 2. Način */
        int[] numbers = {23, 1, 10};
    }
}
