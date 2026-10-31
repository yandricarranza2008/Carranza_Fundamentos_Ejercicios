// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Lee temperaturas hasta -999 y muestra la mayor, la menor y el promedio.

import java.util.Locale;
import java.util.Scanner;

public class Clase_E4_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ESTADÍSTICA DE TEMPERATURAS ===");
        System.out.println("Ingrese temperaturas (use -999 para terminar):");
        
        double temp;
        double suma = 0;
        int contador = 0;
        double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        
        System.out.print("Ingrese temperatura: ");
        temp = scanner.nextDouble();
        
        while (temp != -999) {
            suma += temp;
            contador++;
            
            if (temp > mayor) {
                mayor = temp;
            }
            if (temp < menor) {
                menor = temp;
            }
            
            System.out.print("Ingrese temperatura: ");
            temp = scanner.nextDouble();
        }
        
        System.out.println("\n--- RESULTADOS FINALES ---");
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("Total de lecturas válidas: " + contador);
            System.out.printf("Temperatura máxima: %.2f\n", mayor);
            System.out.printf("Temperatura mínima: %.2f\n", menor);
            System.out.printf("Promedio de temperaturas: %.2f\n", promedio);
        } else {
            System.out.println("No se ingresaron temperaturas válidas.");
        }
        
        scanner.close();
    }
}