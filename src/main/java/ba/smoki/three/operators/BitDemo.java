package ba.smoki.three.operators;

public class BitDemo {
    static void main(String[] args) {
        int number = 24;
        int result = number>>1;     //Za 1 mjesto 12 - za 2 mjesta 6
        int result2 = number<<1;    //Za 1 mjesto 48 - za 2 mjesta 96
        System.out.println(result);
        System.out.println(result2);
    }
}
