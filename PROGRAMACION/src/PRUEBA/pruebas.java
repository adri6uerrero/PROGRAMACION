package PRUEBA;

public class Combinacion {
    final int NumColoresCombinacion = 4; // Número de colores de una combinación
    final int NumColoresJuego = 6; // Número total de posibles colores del juego
    String[] Combi; // Tabla de NumColoresCombinacion elementos que representa la combinación
    String[] TablaColores = {"R", "A", "V", "Z", "M", "B"}; // Posibles colores dentro del juego

    // Método para evaluar la combinación proporcionada con respecto a la combinación secreta
    public void EvaluacionCombinacion(String[] Combi, char[] Resultado) {
        // Implementación de la lógica de evaluación
        // ...
    }
}

public void EvaluacionCombinacion(String[] Combi, String[] Resultado) {
    // Verificar que la combinación proporcionada tenga la misma longitud que la combinación secreta
    if (Combi.length != NumColoresCombinacion || Resultado.length != NumColoresCombinacion) {
        throw new IllegalArgumentException("Las combinaciones proporcionadas tienen longitudes diferentes.");
    }

    // Inicializar el resultado
    for (int i = 0; i < NumColoresCombinacion; i++) {
        Resultado[i] = "";
    }

    // Verificar las coincidencias exactas (color y posición)
    for (int i = 0; i < NumColoresCombinacion; i++) {
        if (Combi[i].equals(this.Combi[i])) {
            Resultado[i] = "X";
        }
    }

    // Verificar las coincidencias de color (posición incorrecta)
    for (int i = 0; i < NumColoresCombinacion; i++) {
        if (!Resultado[i].equals("X")) {
            for (int j = 0; j < NumColoresCombinacion; j++) {
                if (i != j && Combi[i].equals(this.Combi[j]) && Resultado[j].isEmpty()) {
                    Resultado[j] = "O";
                    break;
                }
            }
        }
    }
}

import java.util.Scanner;

public class JuegoMasterMind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generación de la combinación secreta (ordenador)
        Combinacion combinacion = new Combinacion();
        String[] combinacionSecreta = generarCombinacionSecreta(combinacion.NumColoresCombinacion);

        // Jugador humano introduce su combinación
        System.out.println("Introduce tu combinación de colores: ");
        String[] combinacionJugador = scanner.nextLine().toUpperCase().split(" ");

        // Evaluación de la combinación introducida por el jugador
        char[] resultado = new char[combinacion.NumColoresCombinacion];
        combinacion.EvaluacionCombinacion(combinacionJugador, resultado);

        // Mostrar el resultado de la evaluación
        System.out.print("Resultado de la evaluación: ");
        for (char c : resultado) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Método para generar una combinación secreta de colores
    public static String[] generarCombinacionSecreta(int longitud) {
        String[] combinacionSecreta = new String[longitud];
        Combinacion combinacion = new Combinacion();
        for (int i = 0; i < longitud; i++) {
            int index = (int) (Math.random() * combinacion.NumColoresJuego);
            combinacionSecreta[i] = combinacion.TablaColores[index];
        }
        return combinacionSecreta;
    }
}