// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Imprime los múltiplos de 7 entre 1 y 100 y cuántos son.

public class Clase_E5_Carranza {
    public static void main(String[] args) {
        System.out.println("=== MÚLTIPLOS DE 7 ENTRE 1 Y 100 ===");
        
        int cantidad = 0;
        
        System.out.print("Múltiplos encontrados: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                cantidad++;
            }
        }
        
        System.out.println("\n\n--- RESULTADO ---");
        System.out.println("Cantidad total de múltiplos de 7 entre 1 y 100: " + cantidad);
    }
}