import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la distancia del viaje en km: ");
        double km = leer.nextDouble();

        System.out.println("Ingrese el consumo de combustible en litros por km: ");
        double litros = leer.nextDouble();

        System.out.println("Ingrese el precio de combustible por litro: ");
        double precio = leer.nextDouble();

        double consumo;
        consumo = litros * km * precio;

        System.out.println("El costo total del viaje es de $" + consumo);
    }
}
