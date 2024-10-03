import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su estado de ánimo: \n1. Feliz \n2. Triste \n3. Enérgico \n4. Relajado");
        int opcion = leer.nextInt();

        if (opcion<1 || opcion>4) {
            System.out.println("La opción ingresada no se encuentra disponible.");
            System.out.print("Por favor ingrese una opcion nuevamente: ");
            opcion = leer.nextInt();
        }

        switch (opcion) {
            case 1:
                System.out.println("Te recomiendo salir con tus amigos.");
                break;
            case 2:
                System.out.println("Te recomiendo ver una película reconfortante.");
                break;
            case 3:
                System.out.println("Te recomiendo salir a hacer ejercicio.");
                break;
            case 4:
                System.out.println("Te recomiendo escuchar música o leer un libro.");
                break;
            default:
                System.out.println("No se encuentra el estado buscado.");
        }
    }
}
