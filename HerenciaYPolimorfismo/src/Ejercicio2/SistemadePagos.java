package Ejercicio2;

public class SistemadePagos {
    public static void main(String[] args) {
        // Crear instancias de métodos de pago
        TarjetaCredito tarjeta = new TarjetaCredito("Juan Perez", 1234567890, "12/25", 123);
        PayPal paypal = new PayPal("Maria Lopez", 987654321, "maria@gmail.com");

        // Crear el sistema de pagos
        Pagos sistemaPagos = new Pagos();
        sistemaPagos.agregarMetodo(tarjeta);
        sistemaPagos.agregarMetodo(paypal);

        // Mostrar métodos de pago
        System.out.println("Métodos de Pago:");
        sistemaPagos.mostrarPagos();

        // Realizar pagos
        System.out.println("\nRealizando Pagos:");
        sistemaPagos.realizarPagos(1000);

        // Cancelar pagos
        System.out.println("\nCancelando Pagos:");
        sistemaPagos.cancelarPagos();
    }
}
