// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Ecuación cuadrática: lee a, b, c y muestra las raíces reales, la raíz doble o "sin raíces reales" según el discriminante.

import java.util.Locale;
import java.util.Scanner;

public class Tarea1_E1_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ECUACIÓN CUADRÁTICA (ax^2 + bx + c = 0) ===");
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("No es una ecuación cuadrática (a no puede ser 0).");
        } else {
            double discriminante = (b * b) - (4 * a * c);
            
            System.out.println("\n--- RESULTADO ---");
            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.printf("Dos raíces reales distintas:\n x1 = %.2f\n x2 = %.2f\n", x1, x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.printf("Raíz real doble:\n x = %.2f\n", x);
            } else {
                System.out.println("Sin raíces reales (discriminante negativo).");
            }
        }
        scanner.close();
    }
}