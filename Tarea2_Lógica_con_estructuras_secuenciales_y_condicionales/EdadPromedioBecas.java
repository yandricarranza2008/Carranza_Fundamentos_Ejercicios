import java.util.Scanner;
public class EdadPromedioBecas {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("--- EJERCICIO 5: POSTULACIÓN A BECA ---");
        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();
        System.out.print("Ingrese su promedio: ");
        double promedio = leer.nextDouble();
        boolean puedePostular = (edad <= 25) && (promedio >= 8.5);
        System.out.println("¿Puede postular a la beca?: " + puedePostular);
        leer.close();
    }
}
