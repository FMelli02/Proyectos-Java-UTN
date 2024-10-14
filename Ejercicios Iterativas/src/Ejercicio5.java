import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));
        int i = 0;
        do {
            double horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de horas que trabaja el empleado " + (i+1)));
            if (horas > 40) {
                JOptionPane.showMessageDialog(null,"El empleado " + (i+1) + " trabaja " + (horas-40) + " extras.");
            }
            i++;
        } while (i < empleados);
    }
}
