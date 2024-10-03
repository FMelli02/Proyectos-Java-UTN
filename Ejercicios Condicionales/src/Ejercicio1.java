import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su género de película favorito(accion, comedia, drama ó ciencia ficcion: ");
        String opcion = leer.next().toLowerCase();

        switch (opcion) {
            case "accion":
                System.out.println("Te recomendamos ver: Batalla Naval");
                break;
            case "comedia":
                System.out.println("Te recomendamos ver: Son Como Niños");
                break;
            case "drama":
                System.out.println("Te recomendamos ver: Sueño de Fuga");
                break;
            case "ciencia ficcion":
                System.out.println("Te recomendamos ver: Volver al Futuro");
                break;
            default:
                System.out.println("El género buscado no se encuentra disponible");
        }
    }
}
