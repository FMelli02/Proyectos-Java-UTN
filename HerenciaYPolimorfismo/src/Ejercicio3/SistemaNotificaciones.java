package Ejercicio3;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        // Crear instancias de canales de notificación
        CorreoElectronico correo = new CorreoElectronico("Franco Mellimaci", "Bienvenido a nuestra app", "francoIntellij@gmail.com");
        MensajeTexto mensajeTexto = new MensajeTexto("Agustin Altamirano", "Tu código es 15243", "2616547438");

        // Crear el sistema de notificaciones
        Notificaciones sistemaNotificaciones = new Notificaciones();
        sistemaNotificaciones.agregarCanales(correo);
        sistemaNotificaciones.agregarCanales(mensajeTexto);

        // Mostrar canales de notificación
        System.out.println("Canales de Notificación:");
        sistemaNotificaciones.mostrarCanales();

        // Enviar notificaciones
        System.out.println("\nEnviando Notificaciones:");
        sistemaNotificaciones.enviarNotificaciones();

        // Personalizar mensajes
        System.out.println("\nPersonalizando Mensajes...");
        sistemaNotificaciones.personalizarMensajes("Este es un mensaje actualizado para todos los usuarios");

        // Enviar notificaciones nuevamente
        System.out.println("\nEnviando Notificaciones Personalizadas:");
        sistemaNotificaciones.enviarNotificaciones();
    }
}
