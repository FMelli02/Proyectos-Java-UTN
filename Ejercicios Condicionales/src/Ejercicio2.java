import java.util.Objects;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = leer.nextDouble();

        System.out.print("Ingrese su categoría (estudiante, adulto, jubilado): ");
        String categoria = leer.next();

        double precio_final;
        if (categoria.equals("estudiante")) {
            precio_final = precio * 0.90;
            System.out.println("El precio final es de $" + precio_final);
        } else if (categoria.equals("adulto")) {
            precio_final = precio * 0.95;
            System.out.println("El precio final es de $" + precio_final);
        } else if (categoria.equals("jubilado")) {
            precio_final = precio * 0.85;
            System.out.println("El precio final es de $" + precio_final);
        } else {
            System.out.println("La categoría ingresada no existe.");
        }
    }
}
