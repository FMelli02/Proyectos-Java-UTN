import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = leer.nextFloat();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int minutos = leer.nextInt();

        System.out.println("Ingrese la actividad (correr, nadar, bicicleta): ");
        String actividad = leer.next().toLowerCase();

        double calorias_minuto = 0;
        switch (actividad) {
            case "correr":
                calorias_minuto = 0.0175 * 8 * peso;
                break;
            case "nadar":
                calorias_minuto = 0.0175 * 6 * peso;
                break;
            case "bicicleta":
                calorias_minuto = 0.0175 * 4 * peso;
                break;
            default:
                System.out.println("La actividad ingresada no se encuentra disponible.");
                System.exit(0);
        }

        double calorias_quemadas = calorias_minuto * minutos;

        System.out.println("Quemaste " + calorias_quemadas + " calorías.");
    }
}
