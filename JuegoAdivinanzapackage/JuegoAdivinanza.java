import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = 0 //sin determinar
        int intentosMaximos = 10;

        mostrarMensajeBienvenida(intentosMaximos);

        boolean adivinado = jugar(scanner, numeroSecreto, intentosMaximos);

        if (!adivinado) {
            mostrarMensajeDerrota(numeroSecreto);
        }

        scanner.close();
    }

    private static int generarNumeroSecreto(Random random) {
        // Método vacío
        return 0;
    }

    private static void mostrarMensajeBienvenida(int intentosMaximos) {
        // Método vacío
    }

    private static boolean jugar(Scanner scanner, int numeroSecreto, int intentosMaximos) {
        // Método vacío
        return false;
    }

    private static void mostrarMensajeVictoria(int intentos) {
        // Método vacío
    }

    private static void mostrarMensajeDerrota(int numeroSecreto) {
        // Método vacío
    }

    private static void darPista(int intento, int numeroSecreto) {
        // Método vacío
    }
}
