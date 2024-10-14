public class Ejercicio9 {
    public static void main(String[] args) {
        double[] preciosOriginales = {1000.00, 530.00, 127.54, 333.33, 857.22};

        calcularPrecioFinal(preciosOriginales);
    }
    public static void calcularPrecioFinal(double[] precios) {
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio " + (i+1) + " con 10% de descuento: $" + (precios[i]*0.9));
        }
    }
}
