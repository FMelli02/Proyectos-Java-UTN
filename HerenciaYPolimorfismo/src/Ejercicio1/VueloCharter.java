package Ejercicio1;

public class VueloCharter extends Vuelos implements Promocionable {
    private double precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) {
        precioTotal -= precioTotal * (porcentajeDescuento / 100);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " (Charter) - Precio total: " + calcularPrecio();
    }
}
