public class Ejercicio4 {
    public static void main(String[] args) {
        String[] clientes = {"Franco", "Lucas", "Lautaro", "Juani", "Facundo"};
        int[] compras = {6,11,14,20,3};

        calcularDescuento(clientes, compras);
    }

    public static void calcularDescuento(String[] cliente, int[] compra) {
        for (int i = 0; i < cliente.length; i++) {
            if (compra[i] > 10) {
                System.out.println(cliente[i] + " recibiste 10% de descuento.");
            }
        }
    }
}
