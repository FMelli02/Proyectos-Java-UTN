public class Ejercicio3 {
    public static void main(String[] args) {
        String[] clientes = {"Franco", "Lucas", "Lautaro", "Juani", "Facundo"};
        int[] facturasPendientes = {200, 550, 700, 330, 1050};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] cliente, int[] facturas) {
        System.out.println("Clientes que deben más de $500");

        for (int i = 0; i < cliente.length; i++) {
            if (facturas[i] > 500) {
                System.out.println(cliente[i]);
            }
        }
    }
}
