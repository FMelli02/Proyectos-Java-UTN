import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su estado de ánimo (feliz, triste, energico, relajado): ");
        String estado = leer.next().toLowerCase();

        switch (estado) {
            case "feliz":
                System.out.println("Si estás feliz te recomendamos las siguientes canciones:");
                System.out.println("We're Good - Dua Lipa");
                System.out.println("Cake By The Ocean - DNCE");
                System.out.println("Feel It - d4vd");
                break;
            case "triste":
                System.out.println("Si estás triste te recomendamos las siguientes canciones:");
                System.out.println("The Night We Met - Lord Huron");
                System.out.println("Fear of the Water - SYML");
                System.out.println("Falling - Harry Styles");
                break;
            case "energico":
                System.out.println("Si estás enérgico te recomendamos las siguientes canciones:");
                System.out.println("Time of Our Lives - Pitbull ft. Ne-Yo");
                System.out.println("Hey Gringo - KALEO");
                System.out.println("Sultans Of Swing - Dire Straits");
                break;
            case "relajado":
                System.out.println("Si estás relajado te recomendamos las siguientes canciones:");
                System.out.println("In Too Deep - Genesis");
                System.out.println("Fly Love - Jamie Foxx");
                System.out.println("Follow The Sun - Xavier Rudd");
                break;
            default:
                System.out.println("El estado de ánimo ingresado no está disponible.");
        }
    }
}
