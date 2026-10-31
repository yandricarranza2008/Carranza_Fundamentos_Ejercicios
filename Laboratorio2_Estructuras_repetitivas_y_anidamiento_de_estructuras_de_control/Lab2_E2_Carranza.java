// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: E2 - Estadística de un sensor con valor centinela (while).

import java.util.Locale;
import java.util.Scanner;

public class Lab2_E2_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para manejar puntos decimales correctamente
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ESTADÍSTICA DE UN SENSOR (Centinela < 0) ===");
        System.out.println("Ingrese las lecturas de temperatura (ingrese un número negativo para terminar):");
        
        int contador = 0;
        double suma = 0;
        double max = 0;
        double min = 0;
        
        // Primera lectura fuera del ciclo para validar el caso límite inicial
        double temperatura = scanner.nextDouble();
        
        // Si la primera lectura ya es negativa, evitamos entrar al ciclo para prevenir división por cero
        if (temperatura >= 0) {
            max = temperatura;
            min = temperatura;
            suma += temperatura;
            contador++;
            
            // Ciclo while con valor centinela (temperatura negativa)
            while (true) {
                temperatura = scanner.nextDouble();
                if (temperatura < 0) {
                    break; // Condición de salida por centinela
                }
                
                suma += temperatura;
                contador++;
                
                // Actualizar máximo y mínimo
                if (temperatura > max) {
                    max = temperatura;
                }
                if (temperatura < min) {
                    min = temperatura;
                }
            }
        }
        
        // Resultados y prevención de división por cero
        System.out.println("\n--- RESULTADOS ---");
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.printf("Lecturas: %d\n", contador);
            System.out.printf("Promedio: %.2f\n", promedio);
            System.out.printf("Max: %.2f\n", max);
            System.out.printf("Min: %.2f\n", min);
        } else {
            System.out.println("No se ingresaron lecturas válidas (no hubo datos para procesar).");
        }
        
        scanner.close();
    }
}