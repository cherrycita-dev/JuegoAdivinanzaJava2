import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = generarNumeroSecreto(random);
        int intentosMaximos = 10;

        mostrarMensajeBienvenida(intentosMaximos);

        boolean adivinado = jugar(scanner, numeroSecreto, intentosMaximos);

        if (!adivinado) {
            mostrarMensajeDerrota(numeroSecreto);
        }

        scanner.close();
    }

    private static int generarNumeroSecreto(Random random) {
        return random.nextInt(100) + 1; // Genera un número entre 1 y 100
    }

    private static void mostrarMensajeBienvenida(int intentosMaximos) {
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100. Tienes " + intentosMaximos + " intentos para adivinarlo.");
    }

    private static boolean jugar(Scanner scanner, int numeroSecreto, int intentosMaximos) {
        int intentos = 0;
        boolean adivinado = false;

        while (intentos < intentosMaximos && !adivinado) {
            System.out.print("Introduce tu intento: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                adivinado = true;
                mostrarMensajeVictoria(intentos);
            } else {
                darPista(intento, numeroSecreto);
            }
        }

        return adivinado;
    }

    private static void mostrarMensajeVictoria(int intentos) {
        System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
    }

    private static void mostrarMensajeDerrota(int numeroSecreto) {
        System.out.println("Lo siento, se te han acabado los intentos. El número era: " + numeroSecreto);
    }

    private static void darPista(int intento, int numeroSecreto) {
        if (intento < numeroSecreto) {
            System.out.println("El número es mayor.");
        } else {
            System.out.println("El número es menor.");
        }
    }
}