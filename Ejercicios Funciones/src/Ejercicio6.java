public class Ejercicio6 {
    public static void main(String[] args) {
        double[] facturas = {1450.00, 453.76, 2574.76, 1257.65, 877.47};

        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] factura) {
        for (int i = 0; i < factura.length; i++) {
            System.out.println("Factura " + (i+1) + ": $" + (factura[i]*1.21));
        }
    }
}
