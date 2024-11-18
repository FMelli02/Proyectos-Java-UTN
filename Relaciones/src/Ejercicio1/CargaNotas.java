package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el nombre completo del alumno: ");
            String nombreCompleto = leer.nextLine();

            System.out.print("Ingrese el legajo del alumno: ");
            long legajo = leer.nextLong();
            leer.nextLine(); // Consumir el salto de línea

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            System.out.print("Ingrese la cantidad de notas para el alumno: ");
            int cantidadNotas = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese la cátedra: ");
            String catedra = leer.nextLine();

            for (int j = 0; j < cantidadNotas; j++) {

                System.out.print("Ingrese la nota del examen " + (j+1) + ": ");
                double notaExamen = leer.nextDouble();
                leer.nextLine(); // Consumir el salto de línea

                Nota nota = new Nota(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);
        }

        System.out.println("\nInformación de Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
            alumno.mostrarNotas();
            System.out.println("---------------------");
        }
    }
}
