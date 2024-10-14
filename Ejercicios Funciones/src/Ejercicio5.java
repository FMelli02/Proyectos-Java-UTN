public class Ejercicio5 {
    public static void main(String[] args) {
        int[] calificaciones= {3,5,2,4,2};

        double promedio = calcularPromedioSatisfaccion(calificaciones);

        System.out.println("El promedio de satisfacción es de " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificacion) {
        double suma = 0, n = 0;
        double prom = 0;

        for (int i = 0; i < calificacion.length; i++) {
            suma += calificacion[i];
            n +=1;
        }

        prom = suma/n;
        return prom;
    }
}
