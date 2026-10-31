public class EvaluaaManoYLuegoVerifica {
    public static void main(String[] args) throws Exception {
        System.out.println("--- EJERCICIO 6: EVALUACIÓN DE EXPRESIÓN ---");
        int x = 4;
        x *= 3; 
        x %= 5; 
        x += x++;
        System.out.println("El valor final de x es: " + x);
    }
}