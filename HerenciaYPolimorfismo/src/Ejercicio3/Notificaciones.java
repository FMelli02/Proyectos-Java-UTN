package Ejercicio3;

import java.util.ArrayList;

public class Notificaciones {
    private ArrayList<CanalNotificacion> canales;

    public Notificaciones() {
        canales = new ArrayList<>();
    }

    public void agregarCanales(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion(); // Polimorfismo
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje); // Interfaz
            }
        }
    }

    public void mostrarCanales() {
        for (CanalNotificacion canal : canales) {
            System.out.println(canal.getInfoCanal());
        }
    }
}