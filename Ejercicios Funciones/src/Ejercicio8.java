public class Ejercicio8 {
    public static void main(String[] args) {
        String[] empleados = {"Franco", "Lucas", "Lautaro", "Juani", "Facundo"};
        int[] horasTrabajadas = {45,37,26,55,30};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleado, int[] horas) {
        for (int i = 0; i < empleado.length; i++) {
            System.out.println("El pago semanal de " + empleado[i] + " es de $" + (horas[i]*15));
        }
    }
}
