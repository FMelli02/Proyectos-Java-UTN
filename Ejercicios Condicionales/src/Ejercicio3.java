import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su género de libro favorito (fantasia, misterio, romance, ciencia ficción): ");
        String opcion = leer.next();

        switch (opcion) {
            case "fantasia":
                System.out.println("Te recomendamos: Harry Potter - J.K. Rowling");
                break;
            case "misterio":
                System.out.println("Te recomendamos: El Psicoanalista - John Katzenbach");
                break;
            case "romance":
                System.out.println("Te recomendamos: Llámame por tu nombre - André Aciman");
                break;
            case "ciencia ficcion":
                System.out.println("Te recomendamos: Dune - Frank Herbert");
                break;
            default:
                System.out.println("No se encuentra el género buscado.");
        }
    }
}
