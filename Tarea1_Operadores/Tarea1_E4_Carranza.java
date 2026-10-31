// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Clasifica un triángulo por sus lados (equilátero, isósceles, escaleno) y valida que sea triángulo.

import java.util.Locale;
import java.util.Scanner;

public class Tarea1_E4_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CLASIFICACIÓN DE TRIÁNGULOS ===");
        System.out.print("Ingrese el lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el lado c: ");
        double c = scanner.nextDouble();
        
        boolean esTriangulo = (a + b > c) && (a + c > b) && (b + c > a);
        
        System.out.println("\n--- RESULTADO ---");
        if (!esTriangulo) {
            System.out.println("Los valores ingresados NO forman un triángulo válido.");
        } else {
            if (a == b && b == c) {
                System.out.println("El triángulo es EQUILÁTERO (todos los lados iguales).");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es ISÓSCELES (dos lados iguales).");
            } else {
                System.out.println("El triángulo es ESCALENO (todos los lados diferentes).");
            }
        }
        
        scanner.close();
    }
}