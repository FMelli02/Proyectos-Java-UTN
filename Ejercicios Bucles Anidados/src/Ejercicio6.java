import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int n, j;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número mayor a 0:"));
        } while (n < 0);
        System.out.println("Números primos desde 1 a " + n);

        for (int i = 2; i <= n; i++) {
            j = 2;
            while (i % j != 0) {
                j++;
            }
            if (j == i) {
                System.out.println(i);
            }
        }
    }
}
