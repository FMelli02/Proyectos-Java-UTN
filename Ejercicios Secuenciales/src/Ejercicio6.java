import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] materias = {"Arq y Sist Operativos", "Programación Java", "Matemáticas", "Programación Python", "Organización Empresarial"};

        System.out.print("¿Cuántas horas al día puedes estudiar?: ");
        double horas_diarias = leer.nextInt();

        String[] dias_semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("\nTu plan de estudio semanal es:");

        for (String s : dias_semana) {
            System.out.println(s + ":");

            for (int j = 0; j < materias.length; j++) {
                double horas_materia = horas_diarias / materias.length;
                System.out.println(" - " + materias[j] + ": " + horas_materia + " horas");
            }
            System.out.println();
        }
    }
}
