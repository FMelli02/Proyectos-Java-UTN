public class Planeta {
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int distanciaSol;
    private TipoPlaneta tipo;
    private boolean esObservable;
    private double periodoOrbital;
    private double periodoRotacion;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, TipoPlaneta tipo, boolean esObservable, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Distancia del Sol: " + distanciaSol);
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Es Observable: " + esObservable);
        System.out.println("Periodo Orbital: " + periodoOrbital + " años");
        System.out.println("Periodo de Rotación: " + periodoRotacion + " días");
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaExterior() {
        double distanciaUA = (distanciaSol * 1000000) / 149597870.0;
        return distanciaUA > 3.4;
    }
}
