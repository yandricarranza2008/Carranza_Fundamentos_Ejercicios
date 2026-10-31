// Autor: Yandri Sebastian Carranza Chicaiza
import java.util.Scanner;

public class T1_P2_EsPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        
        System.out.println("¿Es par? " + (numero % 2 == 0));
        
        sc.close();
    }
}