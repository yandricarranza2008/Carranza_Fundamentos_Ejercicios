// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Factorial de n validando que n >= 0 (do-while).

import java.util.Scanner;

public class Clase_E2_Carranza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.println("=== CÁLCULO DE FACTORIAL ===");
        
        do {
            System.out.print("Ingrese un número entero n (n >= 0): ");
            n = scanner.nextInt();
            
            if (n < 0) {
                System.out.println("Error: El número debe ser mayor o igual a cero. Intente de nuevo.");
            }
        } while (n < 0);
        
        long factorial = 1; 
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("\n--- RESULTADO ---");
        System.out.println("El factorial de " + n + "! es: " + factorial);
        
        scanner.close();
    }
}