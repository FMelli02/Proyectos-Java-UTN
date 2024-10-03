import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Juego piedra, papel o tijera:");
        System.out.print("Elija que jugar: \n1. Piedra \n2.Papel \n3.Tijera");
        System.out.println();
        int opcion = leer.nextInt();

        if (opcion < 1 || opcion > 3) {
            System.out.println("El número ingresado no corresponde a una opción válida.");
            System.out.print("Ingrese nuevamente un número válido: ");
            opcion = leer.nextInt();
        }

        int opcionpc = (int) (Math.random() * 3) + 1;

        if (opcion == 1) {
            if (opcionpc == 1) {
                System.out.println("Empate");
            } else if (opcionpc == 2) {
                System.out.println("Papel gana a Piedra, usted pierde :(");
            } else {
                System.out.println("Piedra gana a Tijera, usted gana :)");
            }
        } else if (opcion == 2) {
            if (opcionpc == 1) {
                System.out.println("Papel gana a Piedra, usted gana :)");
            } else if (opcionpc == 2) {
                System.out.println("Empate");
            } else {
                System.out.println("Tijera gana a Papel, usted pierde :(");
            }
        } else {
            if (opcionpc == 1) {
                System.out.println("Piedra gana a Tijera, usted pierde :(");
            } else if (opcionpc == 2) {
                System.out.println("Tijera gana a Papel, usted gana :)");
            } else {
                System.out.println("Empate");
            }
        }
    }
}
