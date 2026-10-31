/**
 * Nombre completo: Yandri Sebastian Carranza Chicaiza
 * NRC: 37712
 * Fecha: 28 / 10 / 2026
 * Enunciado: E3 - Cifras de un número entero de cuatro cifras (suma, invertido y paridad).
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E3_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero de cuatro cifras: ");
        int n = sc.nextInt();

        int millar = n / 1000;
        int centena = (n / 100) % 10;
        int decena = (n / 10) % 10;
        int unidad = n % 10;

        int sumaCifras = millar + centena + decena + unidad;
        int invertido = (unidad * 1000) + (decena * 100) + (centena * 10) + millar;
        boolean esPar = (n % 2 == 0);

        System.out.println("\n----------------------------------------");
        System.out.println("Suma de cifras: " + sumaCifras);
        System.out.println("Invertido: " + invertido);
        System.out.println("Es par: " + esPar);
        System.out.println("----------------------------------------");

        sc.close();
    }
}