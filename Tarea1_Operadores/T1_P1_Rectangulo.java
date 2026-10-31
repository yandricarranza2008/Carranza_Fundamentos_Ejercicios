// Autor: Yandri Sebastian Carranza Chicaiza
import java.util.Scanner;

public class T1_P1_Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        
        sc.close();
    }
}