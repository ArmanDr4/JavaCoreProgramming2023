package ba.smoki.three.operators;

public class UnaryDemo {
    static void main(String[] args) {
        int number = +23;
        System.out.println(number);
        number = -23;
        System.out.println(number);
        number++;       //Operator: POST Increment
        System.out.println(number);
        number = 23;
        ++number;       //Operator: PRE Increment
        System.out.println(number);
        number = 23;
        System.out.println(++number + " <<");
    }
}
