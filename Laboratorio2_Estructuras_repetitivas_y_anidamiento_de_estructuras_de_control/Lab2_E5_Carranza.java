// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: E5 - Cajero automático con menú repetitivo (do-while y switch).

import java.util.Locale;
import java.util.Scanner;

public class Lab2_E5_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 500.00; // Saldo inicial requerido
        int opcion;
        
        do {
            System.out.println("\n=== CAJERO AUTOMÁTICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.printf("Saldo actual: $%.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito aceptado.");
                    } else {
                        System.out.println("Monto inválido. No se permiten depósitos negativos o en cero.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Fondos insuficientes o monto inválido.");
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa. ¡Gracias por usar el cajero!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
            
        } while (opcion != 0);
        scanner.close();
    }
}