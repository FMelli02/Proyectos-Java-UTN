import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int productos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos:"));

        int i = 0;

        while (i < productos) {
            int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible del producto " + (i+1)));

            if (cant < 5) {
                JOptionPane.showMessageDialog(null,"Hay que realizar un pedido del producto " + (i+1));
            } else {
                JOptionPane.showMessageDialog(null,"Todavía hay stock.");
            }
            i ++;
        }
    }
}
