public class Main {
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000,TipoPlaneta.TERRESTRE,true,1,1);
        Planeta p2 = new Planeta("Jupiter",79,1.899E27,1.4313E15,139820,750000000,TipoPlaneta.GASEOSO,true,11.86,0.41);

        p1.imprimir();
        System.out.println("Densidad de " + p1.getNombre() + ": " + p1.calcularDensidad() + " kg/km³");
        System.out.println("Es planeta exterior: " + p1.esPlanetaExterior());
        System.out.println();

        p2.imprimir();
        System.out.println("Densidad de " + p2.getNombre() + ": " + p2.calcularDensidad() + " kg/km³");
        System.out.println("Es planeta exterior: " + p2.esPlanetaExterior());
    }
}
