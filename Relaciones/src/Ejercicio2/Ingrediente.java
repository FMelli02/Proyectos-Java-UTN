package Ejercicio2;

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidadDeMedida;

    public Ingrediente(String nombre, double cantidad, String unidadDeMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
    }

    @Override
    public String toString() {
        return nombre + " " + cantidad + " " + unidadDeMedida;
    }
}
