import java.util.Scanner;

/**
 * Clase Main que contiene el método principal para ejecutar el programa.
 */
public class Main {
    /**
     * Método principal que ejecuta el programa.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        Persona persona = new Persona(peso, altura);

        System.out.println(persona.obtenerMensajeIMC());

        scanner.close();
    }
}
