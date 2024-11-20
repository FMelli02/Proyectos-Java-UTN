package Ejercicio1;

import java.util.ArrayList;

public class Reservas {
    public ArrayList<Vuelos> vuelos;

    public Reservas() {
        vuelos = new ArrayList<>();
    }

    public void agregarVuelos(Vuelos vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularTotalReservas() {
        double total = 0;
        for (Vuelos vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones(double porcentaje) {
        for (Vuelos vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion(porcentaje);
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelos vuelo : vuelos) {
            System.out.println(vuelo.origen + " hacia " + vuelo.destino + " - Precio: " + vuelo.calcularPrecio());
        }
    }

}
