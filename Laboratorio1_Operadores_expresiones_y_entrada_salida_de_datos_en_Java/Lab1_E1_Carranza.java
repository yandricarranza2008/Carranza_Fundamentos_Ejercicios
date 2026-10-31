/**
 * Nombre completo: Yandri Sebastian Carranza Chicaiza
 * NRC: 37712
 * Fecha: 28 / 10 / 2026
 * Enunciado: E1 - Conversión de temperatura (Celsius a Fahrenheit y Kelvin)
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Carranza {
    public static void main(String[] args) {
        // Configurar Locale para usar el punto decimal obligatoriamente
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        // Proceso (Uso de 9.0 / 5.0 para evitar la división entera)
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        double kelvin = celsius + 273.15;

        // Salida con formato de columnas alineadas
        System.out.println("\n----------------------------------------");
        System.out.printf("%-12s %10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s %10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s %10.2f%n", "Kelvin", kelvin);
        System.out.println("----------------------------------------");

        sc.close();
    }
}
