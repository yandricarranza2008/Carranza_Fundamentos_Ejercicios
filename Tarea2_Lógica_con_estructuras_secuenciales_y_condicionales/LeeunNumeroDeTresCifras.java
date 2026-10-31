import java.util.Scanner;
public class LeeunNumeroDeTresCifras {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("--- EJERCICIO 3: CENTENAS, DECENAS Y UNIDADES ---");
        System.out.print("Ingrese un número entero de 3 cifras: ");
        int numero = leer.nextInt();
        int centenas = numero / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        leer.close();
    }
}
