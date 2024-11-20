package Ejercicio2;

import java.util.ArrayList;

public class Pagos {
    private ArrayList<MetodoPago> metodoPagos;

    public Pagos() {
        metodoPagos = new ArrayList<>();
    }

    public void agregarMetodo(MetodoPago metodo) {
        metodoPagos.add(metodo);
    }

    public void realizarPagos(double monto) {
        for (MetodoPago metodo : metodoPagos) {
            metodo.realizarPago(monto);
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodo : metodoPagos) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }

    public void mostrarPagos() {
        for (MetodoPago metodo : metodoPagos) {
            System.out.println("Titular: " + metodo.titular);
        }
    }
}
