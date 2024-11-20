package Ejercicio1;

public abstract class Vuelos {
    protected int numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    public Vuelos(int numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();

    public String getInfo() {
        return "Vuelo número " + numeroVuelo + " desde " + origen + " a " + destino + " la fecha " + fecha;
    }
}
