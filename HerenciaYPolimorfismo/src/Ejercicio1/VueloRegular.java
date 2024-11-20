package Ejercicio1;

public class VueloRegular extends Vuelos implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) {
        precioBasePorAsiento -= precioBasePorAsiento * (porcentajeDescuento / 100);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " (Regular) - Precio total: " + calcularPrecio();
    }
}
