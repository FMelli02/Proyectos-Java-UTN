import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int empleados = leer.nextInt();

        for (int i = 0; i < empleados; i++) {
            System.out.print("Ingrese las horas trabajadas del empleado " + (i+1) + ": ");
            float horas = leer.nextFloat();
            float total = horas * 15;
            System.out.println("El salario del empleado " + (i+1) + " es de $" + total);
        }
    }
}
