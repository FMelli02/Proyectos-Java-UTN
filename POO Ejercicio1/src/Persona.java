public class Persona {
    private String nombre;
    private String apellidos;
    private String numeroDocumentoIdentidad;
    private int anioNacimiento;
    private String nacionalidad;
    private char genero;

    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento, String nacionalidad, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellidos);
        System.out.println("DNI: " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Género: " + genero);
        System.out.println();
    }

}
