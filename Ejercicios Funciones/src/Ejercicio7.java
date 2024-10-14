public class Ejercicio7 {
    public static void main(String[] args) {
        int[] compras = {550,500,343,740,1000};

        aplicarDescuento(compras);
    }
    public static void aplicarDescuento(int[] compra) {
        for (int i = 0; i < compra.length; i++) {
            if (compra[i] > 500) {
                System.out.println("El precio final es de $" + (compra[i]*0.85));
            }
        }
    }
}
