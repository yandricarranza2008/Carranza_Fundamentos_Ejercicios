import java.util.Scanner;
public class ConvertirMinutosaHoras {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("--- EJERCICIO 4: CONVERSIÓN DE MINUTOS A HORAS Y MINUTOS ---");
        System.out.print("Ingrese la cantidad de minutos: ");
        int minutosTotales = leer.nextInt();
        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;
        System.out.println(minutosTotales + " min -> " + horas + " h " + minutosRestantes + " min");
        leer.close();
    }
}
