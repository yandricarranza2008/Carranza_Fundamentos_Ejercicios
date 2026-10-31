// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: E3 - El juego "adivina el número" con límite de 7 intentos (do-while).

import java.util.Scanner;
import java.util.Random;

public class Lab2_E3_Carranza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random azar = new Random();
        
        int numeroSecreto = azar.nextI<nt(100) + 1; // Número aleatorio entre 1 y 100
        int intentosMaximos = 7;
        int intentoActual = 0;
        int numeroIngresado;
        boolean adivinado = false;
        
        System.out.println("=== JUEGO: ADIVINA EL NÚMERO ===");
        System.out.println("He pensado un número entre 1 y 100. Tienes 7 intentos para adivinarlo.");
        
        // Ciclo do-while que controla los intentos y la condición de salida
        do {
            intentoActual++;
            System.out.print("\nIntento " + intentoActual + " de " + intentosMaximos + ". Ingresa tu número: ");
            numeroIngresado = scanner.nextInt();
            
            if (numeroIngresado == numeroSecreto) {
                adivinado = true;
                break;
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("El número secreto es MÁS ALTO.");
            } else {
                System.out.println("El número secreto es MÁS BAJO.");
            }
            
        } while (intentoActual < intentosMaximos && !adivinado);
        
        System.out.println("\n--- RESULTADO FINAL ---");
        if (adivinado) {
            System.out.println("¡Felicidades! ¡Adivinaste el número en " + intentoActual + " intentos!");
        } else {
            System.out.println("¡Se te acabaron los 7 intentos! El número secreto era: " + numeroSecreto);
        }
        
        scanner.close();
    }
}