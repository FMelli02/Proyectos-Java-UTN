import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = leer.nextDouble();

        System.out.print("Ingrese su altura en cm: ");
        double altura = leer.nextDouble();

        altura /= 100;

        double imc = peso/Math.pow(altura,2);

        if (imc < 18.5) {
            System.out.println("Peso inferior al normal");
        } else if (imc > 18.4 & imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >24.9 & imc < 30) {
            System.out.println("Peso superior al normal");
        }else {
            System.out.println("Obesidad");
        }
    }
}
