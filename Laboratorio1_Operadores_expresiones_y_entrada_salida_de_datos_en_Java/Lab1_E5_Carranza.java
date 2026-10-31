/**
 * Nombre completo: Yandri Sebastian Carranza Chicaiza
 * NRC: 37712
 * Fecha: 2026-10-28
 * Enunciado: E5 - Evaluación de expresiones aritméticas, relacionales y lógicas.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E5_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el valor de b: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el valor de c: ");
        int c = sc.nextInt();

        // Expresión de ejemplo: (a > b) y que el promedio entre c sea mayor a 3
        boolean resultadoLogico = (a > b) && (((double)(a + b) / c) > 3.0);
        double resultadoAritmetico = (a * b) - (Math.pow(c, 2));

        System.out.println("\n----------------------------------------");
        System.out.println("Resultado Aritmético: " + resultadoAritmetico);
        System.out.println("Resultado Lógico:     " + resultadoLogico);
        System.out.println("----------------------------------------");

        sc.close();
    }
}
