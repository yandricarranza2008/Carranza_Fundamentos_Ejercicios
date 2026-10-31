/**
 * Nombre completo: Yandri Sebastian Carranza Chicaiza
 * NRC: 37712
 * Fecha: 28 / 10 / 2026
 * Enunciado: E4 - Factura con cálculo de subtotal, IVA y total a pagar.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Carranza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el precio unitario ($): ");
        double precioUnitario = sc.nextDouble();

        double subtotal = cantidad * precioUnitario;
        double iva = subtotal * 0.15;
        double totalPagar = subtotal + iva;

        System.out.println("\n----------------------------------------");
        System.out.printf("Subtotal:    $%.2f\n", subtotal);
        System.out.printf("IVA 15%%:     $%.2f\n", iva);
        System.out.printf("Total Pagar: $%.2f\n", totalPagar);
        System.out.println("----------------------------------------");

        sc.close();
    }
}