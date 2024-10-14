import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int i = 0;
        float total = 0;
        while (i < 7) {
            float ventas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese las ventas del día " + (i+1)));
            total += ventas;
            i ++;
        }
        JOptionPane.showMessageDialog(null,"El total de ventas es de $" + total);
    }
}
