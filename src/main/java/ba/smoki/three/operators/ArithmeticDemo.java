package ba.smoki.three.operators;

import javax.swing.*;
import java.awt.*;

/**
 * <p>
 *     <li> Additive + </li>
 *     <li> Subtraction - </li>
 *     <li> Multiplication * </li>
 *     <li> Division / </li>
 *     <li> Modulo % </li>
 * </p>
 */

public class ArithmeticDemo {
    static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Unesi prvi broj");
        double broj1 = Double.parseDouble(number1);
        String number2 = JOptionPane.showInputDialog("Unesi drugi broj");
        double broj2 = Double.parseDouble(number2);
        double suma = broj1 + broj2;
        JOptionPane.showMessageDialog(null, "Suma = " + suma);
        double razlika = broj1 - broj2;
        JOptionPane.showMessageDialog(null, "Razlika = " + razlika);
        double product = broj1 * broj2;
        JOptionPane.showMessageDialog(null, "Proizvod = " + product);
        double division = broj1/broj2;
        JOptionPane.showMessageDialog(null, "Dijeljenje = " + division);
        double modulo = broj1 % broj2;
        JOptionPane.showMessageDialog(null, "Modulo = " + modulo);

    }
}
