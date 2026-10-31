import java.util.Scanner;
public class NumeroEntero {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("--- EJERCICIO 2: NÚMERO PAR (TRUE/FALSE) ---");
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();
        boolean esPar = (numero % 2 == 0);
        System.out.println("¿El número es par?: " + esPar);
        leer.close();
    }
}
