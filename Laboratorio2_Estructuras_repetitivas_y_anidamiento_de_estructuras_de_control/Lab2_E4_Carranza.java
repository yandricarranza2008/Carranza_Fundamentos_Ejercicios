// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: E4 - Rombo de asteriscos con validación de número impar positivo (do-while y for anidados).

import java.util.Scanner;

public class Lab2_E4_Carranza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.println("=== DIBUJAR ROMBO DE ASTERISCOS ===");
        
        // Validación con do-while: se repite si n es par o menor/igual a cero
        do {
            System.out.print("Ingrese un número entero IMPAR y positivo (n): ");
            n = scanner.nextInt();
            
            if (n <= 0 || n % 2 == 0) {
                System.out.println("Valor inválido. El número debe ser positivo e impar. Intente de nuevo.");
            }
        } while (n <= 0 || n % 2 == 0);
        
        int mitad = n / 2;
        System.out.println("\n--- ROMBO DE TAMAÑO " + n + " ---");
        
        // Parte superior del rombo (incluyendo la fila del centro)
        for (int i = 0; i <= mitad; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < (mitad - i); j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Parte inferior del rombo
        for (int i = mitad - 1; i >= 0; i--) {
            // Imprimir espacios en blanco
            for (int j = 0; j < (mitad - i); j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

