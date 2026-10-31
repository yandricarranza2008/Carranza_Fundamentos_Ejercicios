/**
 * Nombre completo: Yandri Sebastian Carranza Chicaiza
 * NRC: 37712
 * Fecha: 2026-10-28
 * Enunciado: E2 - Desglose de tiempo en horas, minutos y segundos a partir de segundos totales.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E2_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tiempo total en segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int minutosRestantes = totalSegundos % 3600;
        int minutos = minutosRestantes / 60;
        int segundos = minutosRestantes % 60;

        System.out.println("\n----------------------------------------");
        System.out.println(totalSegundos + " s = " + horas + " h " + minutos + " min " + segundos + " s");
        System.out.println("----------------------------------------");

        sc.close();
    }
}
