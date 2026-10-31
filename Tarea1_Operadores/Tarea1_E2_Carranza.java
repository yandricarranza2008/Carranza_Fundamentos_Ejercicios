// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Año bisiesto: divisible para 4 y no para 100, o divisible para 400.

import java.util.Scanner;

public class Tarea1_E2_Carranza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VERIFICADOR DE AÑO BISIESTO ===");
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        
        System.out.println("\n--- RESULTADO ---");
        if (esBisiesto) {
            System.out.println("El año " + anio + " SÍ es bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }
        
        scanner.close();
    }
}