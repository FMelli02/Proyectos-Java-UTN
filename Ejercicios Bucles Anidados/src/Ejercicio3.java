import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n;
        int factorial, suma = 0;

        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número mayor a 0:"));
        } while (n < 0);

        for (int i = 0; i <= n; i++) {
            factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            suma += factorial;

            System.out.println(i + "! = " + factorial);
        }

        System.out.println("Suma de los factoriales: " + suma);
    }
}
