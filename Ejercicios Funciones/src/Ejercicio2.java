public class Ejercicio2 {
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Celular", "Notebook", "Tablet", "Cámara"};
        int[] stocks = {2,13,4,7,3};

        generarReporteBajoStock(productos, stocks);
    }

    public static void generarReporteBajoStock(String[] prod, int[] stock) {
        System.out.println("Productos con bajo stock: ");
        for (int i = 0; i < prod.length; i++) {
            if (stock[i] < 5) {
                System.out.println(prod[i] + " - Unidades: " + stock[i]);
            }
        }
    }
}
