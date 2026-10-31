import java.util.Scanner;
public class CalcularelAreayPerimetroDeunRectangulo {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("--- EJERCICIO 1: ÁREA Y PERÍMETRO DE UN RECTÁNGULO ---");
        System.out.print("Ingrese la base del rectángulo: ");
        double base = leer.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = leer.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);
        leer.close();
    }
}