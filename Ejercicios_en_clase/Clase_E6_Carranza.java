// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Simula el crecimiento de bacterias que se duplican cada hora (partiendo de 100 hasta superar 1 000 000).

public class Clase_E6_Carranza {
    public static void main(String[] args) {
        System.out.println("=== CRECIMIENTO DE BACTERIAS ===");
        
        long bacterias = 100; 
        int horas = 0;
        long limite = 1000000;
        
        while (bacterias <= limite) {
            bacterias *= 2; 
            horas++;
            System.out.println("Hora " + horas + ": " + bacterias + " bacterias.");
        }
        
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Partiendo de 100 bacterias, se necesitan " + horas + " horas para superar 1'000,000 (Llegando a " + bacterias + ").");
    }
}
