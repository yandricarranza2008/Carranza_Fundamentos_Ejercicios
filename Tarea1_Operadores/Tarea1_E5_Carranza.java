// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Menú con switch para convertir unidades: 1) m->ft, 2) kg->lb, 3) C->F.

import java.util.Locale;
import java.util.Scanner;

public class Tarea1_E5_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MENÚ DE CONVERSIÓN DE UNIDADES ===");
        System.out.println("1. Metros a Pies (m -> ft)");
        System.out.println("2. Kilogramos a Libras (kg -> lb)");
        System.out.println("3. Celsius a Fahrenheit (°C -> °F)");
        System.out.print("Seleccione una opción (1-3): ");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad en metros (m): ");
                double metros = scanner.nextDouble();
                double pies = metros * 3.28084;
                System.out.printf("%.2f metros equivalen a %.2f pies.\n", metros, pies);
                break;
                
            case 2:
                System.out.print("Ingrese la cantidad en kilogramos (kg): ");
                double kg = scanner.nextDouble();
                double lb = kg * 2.20462;
                System.out.printf("%.2f kg equivalen a %.2f lb.\n", kg, lb);
                break;
                
            case 3:
                System.out.print("Ingrese la temperatura en grados Celsius (°C): ");
                double c = scanner.nextDouble();
                double f = (c * 9.0 / 5.0) + 32.0;
                System.out.printf("%.2f °C equivalen a %.2f °F.\n", c, f);
                break;
                
            default:
                System.out.println("Opción inválida. Seleccione entre 1 y 3.");
                break;
        }
        
        scanner.close();
    }
}