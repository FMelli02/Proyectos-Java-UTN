package Ejercicio1;

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        // Crear vuelos
        VueloRegular vuelo1 = new VueloRegular(12342, "Mendoza", "Ciudad de México", "2024-11-20", 170, 104.5);
        VueloCharter vuelo2 = new VueloCharter(45356, "Barcelona", "Moscú", "2024-11-25", 17000);

        // Agregar vuelos
        reservas.agregarVuelos(vuelo1);
        reservas.agregarVuelos(vuelo2);

        // Mostrar información de los vuelos
        System.out.println("Vuelos antes de aplicar promociones:");
        reservas.mostrarVuelos();

        // Aplicar promociones
        reservas.aplicarPromociones(10);

        System.out.println("\nVuelos después de aplicar promociones:");
        reservas.mostrarVuelos();

        // Calcular precio total
        System.out.println("\nPrecio total de las reservas: " + reservas.calcularTotalReservas());
    }
}
