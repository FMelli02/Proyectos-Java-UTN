import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 0; i < 4; i++) {
            int horas = 0;
            switch (i) {
                case 0:
                    horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas dedicadas a estudiar:"));
                    break;
                case 1:
                    horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas dedicadas a hacer ejercicio:"));
                    break;
                case 2:
                    horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas dedicadas a leer:"));
                    break;
                case 3:
                    horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas dedicadas a tiempo libre:"));
                    break;
                default:
                    System.out.println();
            }
            total += horas;
        }

        JOptionPane.showMessageDialog(null,"El tiempo total dedicado es de " + total + " horas.");
    }
}
