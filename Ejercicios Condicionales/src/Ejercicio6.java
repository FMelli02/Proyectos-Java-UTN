import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Cuántas horas duermes al día? ");
        double horas_dormir = leer.nextDouble();

        System.out.print("Cuántas horas al día haces ejercicio? ");
        double horas_ejercicio = leer.nextDouble();

        System.out.print("Cuántas comidas saludables consumes al día? ");
        int comidas = leer.nextInt();

        System.out.println("Evaluación de hábito de sueño:");
        if (horas_dormir >= 7 && horas_dormir <= 9) {
            System.out.println(" - Duermes bien, entre 7 y 9 horas es lo recomendado.");
        } else if (horas_dormir < 7) {
            System.out.println(" - Duermes menos de lo recomendado, deberías descansar más.");
        } else {
            System.out.println(" - Duermes más de lo necesario, trata de regular tu horario de sueño.");
        }

        System.out.println("Evaluación de hábitos de ejercicio:");
        if (horas_ejercicio >= 1) {
            System.out.println(" - Haces suficiente ejercicio diario, ¡muy bien!");
        } else {
            System.out.println(" - No haces suficiente ejercicio, trata de realizar al menos 30 minutos al día.");
        }

        System.out.println("Evaluación de hábitos alimenticios:");
        if (comidas >= 2) {
            System.out.println(" - Tienes una buena alimentación, consumes suficientes comidas saludables.");
        } else {
            System.out.println(" - Deberías mejorar tu alimentación, intenta incluir más comidas saludables en tu día.");
        }
    }
}
