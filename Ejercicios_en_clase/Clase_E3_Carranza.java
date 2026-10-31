// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Cuenta las cifras de un entero y calcula su suma (while con n /= 10).

import java.util.Scanner;

public class Clase_E3_Carranza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CONTEO Y SUMA DE CIFRAS ===");
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        int auxiliar = Math.abs(numero); 
        int contadorCifras = 0;
        int sumaCifras = 0;
        
        if (auxiliar == 0) {
            contadorCifras = 1;
            sumaCifras = 0;
        } else {
            while (auxiliar > 0) {
                int digito = auxiliar % 10; 
                sumaCifras += digito;
                contadorCifras++;
                auxiliar /= 10; 
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Número analizado: " + numero);
        System.out.println("Cantidad de cifras: " + contadorCifras);
        System.out.println("Suma de las cifras: " + sumaCifras);
        
        scanner.close();
    }
}