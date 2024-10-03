import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su nivel de condición física (principiante, intermedio, avanzado): ");
        String condicion_fisica = leer.next().toLowerCase();

        switch (condicion_fisica) {
            case "principiante":
                System.out.println("Rutina Principiante (2-3 días a la semana):");
                System.out.println("30 minutos caminata\nAbdominales 3x15\nBurpies 3x10");
                break;
            case "intermedio":
                System.out.println("Rutina Intermedio (4-5 días a la semana):");
                System.out.println("30 minutos correr\nAbdominales 4x20\nBurpies 3x15\nFlexiones de brazos 3x10");
                break;
            case "avanzado":
                System.out.println("Rutina Avanzado (5-7 días a la semana):");
                System.out.println("60 minutos correr\nAbdominales 4x25\nBurpies 4X20\nFlexiones de brazos 4x20");
                break;
            default:
                System.out.println("No se encuentra la condición que busca.");
        }
    }
}
