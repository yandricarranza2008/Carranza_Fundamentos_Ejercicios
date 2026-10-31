// Autor: Yandri Sebastian Carranza Chicaiza
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: E1 - Tabla de multiplicar completa del 1 al 10 en matriz alineada.

public class Lab2_E1_Carranza {
    public static void main(String[] args) {
        System.out.println("=== TABLA DE MULTIPLICAR COMPLETA (1 al 10) ===");
        
        // Ciclo externo para las filas
        for (int i = 1; i <= 10; i++) {
            // Ciclo interno para las columnas
            for (int j = 1; j <= 10; j++) {
                // Imprime cada valor alineado a la derecha en un ancho fijo de 4 espacios
                System.out.printf("%4d", i * j);
            }
            // Salto de línea al terminar cada fila
            System.out.println();
        }
    }
}
