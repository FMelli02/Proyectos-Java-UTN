import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] ventas = new double[30];

        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas del día " + (i+1) + ":"));
        }

        double ingresos = calcularIngresosMensuales(ventas);

        JOptionPane.showMessageDialog(null,"Los ingresos totales del mes son: $" + ingresos);
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;

        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }
}
