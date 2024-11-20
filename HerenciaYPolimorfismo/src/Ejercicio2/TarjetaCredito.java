package Ejercicio2;

public class TarjetaCredito extends MetodoPago implements Cancelable{
    private String fechaExpiracion;
    private int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Realizando pago de $" + monto + " con tarjeta de crédito de " + titular);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago de tarjeta de crédito de " + titular);
    }
}
