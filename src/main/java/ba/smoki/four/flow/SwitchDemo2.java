package ba.smoki.four.flow;

import javax.swing.*;

public class SwitchDemo2 {
    static void main(String[] args) {
        String weekDayName = JOptionPane.showInputDialog("Unesi ime dana u sedmici na Francuskom");
        String weekDayNativeName;
        int weekDayNumber;
        switch (weekDayName.toLowerCase()){
            case "lundi":
                weekDayNativeName = "Ponedjeljak";
                break;
            case "mardi":
                weekDayNativeName = "Utorak";
                break;
            case "mercredi":
                weekDayNativeName = "Srijeda";
                break;
            case "jeudi":
                weekDayNativeName = "Četvrtak";
                break;
            case "venderi":
                weekDayNativeName = "Petak";
                break;
            case "samedi":
                weekDayNativeName = "Subota";
                break;
            case "dimanche":
                weekDayNativeName = "Nedjelja";
                break;
            default:
                weekDayNativeName = "Ponovite unos";
        }
        JOptionPane.showMessageDialog(null, weekDayNativeName);
    }
}
