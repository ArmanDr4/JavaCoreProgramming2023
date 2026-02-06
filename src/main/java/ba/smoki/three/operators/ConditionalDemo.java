package ba.smoki.three.operators;

import java.util.Scanner;

/**
 * && -> USLOVNI AND
 * || -> ILI uslovni OR
 */

public class ConditionalDemo {
    static void main(String[] args) {
        System.out.println("Unesite prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        // (number1 == 1 && number2 == 23) -> I prvi i drugi moraju zadovoljiti uslov
        if ((number1 == 1) && (number2 == 23)) {
            System.out.println("Broj 1 je 1, a uneseni broj 2 je sigurno 23");
        }
        // ((number1 == 23) || (number2 == 23)) -> Prvi ili drugi moraju zadovoljiti uslov
        if((number1 == 23) || (number2 == 23)) {
            System.out.println("Jedan od dvojice je Michael Jordan");
        }
    }
}