import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Encuesta de felicidad (califica del 1 al 10)");

        System.out.print("Nivel de satisfacción con la vida? ");
        int vida = leer.nextInt();

        System.out.print("Nivel de estrés (10 es mucho estrés)? ");
        int estres = leer.nextInt();

        System.out.print("Nivel de salud? ");
        int salud = leer.nextInt();

        System.out.print("Nivel de relaciones personales? ");
        int relaciones = leer.nextInt();

        System.out.print("Nivel de equilibrio entre vida y trabajo? ");
        int equilibrio = leer.nextInt();

        double indice_felicidad = (vida + (10-estres) + salud + relaciones + equilibrio) / 5.0;

        System.out.println("Su índice de felicidad es de: " + indice_felicidad);
    }
}
