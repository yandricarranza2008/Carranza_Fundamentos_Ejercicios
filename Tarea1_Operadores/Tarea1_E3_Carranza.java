// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Tarifa de parqueadero: primera hora $1,00, cada hora adicional $0,50, tope diario $6,00.

import java.util.Locale;
import java.util.Scanner;

public class Tarea1_E3_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CÁLCULO DE TARIFA DE PARQUEADERO ===");
        System.out.print("Ingrese el número de horas estacionado: ");
        int horas = scanner.nextInt();
        
        double totalPagar = 0;
        
        if (horas <= 0) {
            System.out.println("Tiempo inválido.");
        } else if (horas == 1) {
            totalPagar = 1.00;
        } else {
            totalPagar = 1.00 + (horas - 1) * 0.50;
        }
        
        if (totalPagar > 6.00) {
            totalPagar = 6.00;
        }
        
        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Total a pagar por %d hora(s): $%.2f\n", horas, totalPagar);
        
        scanner.close();
    }
}