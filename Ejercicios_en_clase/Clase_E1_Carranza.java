// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Suma de los n primeros números naturales y comparación con la fórmula n*(n+1)/2.

import java.util.Scanner;

public class Clase_E1_Carranza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SUMA DE N NÚMEROS NATURALES ===");
        System.out.print("Ingrese el valor de n (entero positivo): ");
        int n = scanner.nextInt();
        
        int sumaBucle = 0;
        // Ciclo for para sumar usando bucle
        for (int i = 1; i <= n; i++) {
            sumaBucle += i;
        }
        
        int sumaFormula = (n * (n + 1)) / 2;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma calculada mediante bucle: " + sumaBucle);
        System.out.println("Suma calculada mediante fórmula: " + sumaFormula);
        System.out.println("¿Coinciden los resultados?: " + (sumaBucle == sumaFormula));
        
        scanner.close();
    }
}