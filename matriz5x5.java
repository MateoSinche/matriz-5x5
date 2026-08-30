import java.util.Scanner;


class Matriz5x5  {
 
    static final int FILAS = 5;
    static final int COLUMNAS = 5;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] datos = new int[FILAS][COLUMNAS];
 
        llenarMatriz(datos, teclado);
        mostrarMatriz(datos);
 
        teclado.close();
    }
 
    private static void llenarMatriz(int[][] datos, Scanner teclado) {
        System.out.println("Ingrese los 25 valores de la matriz (5x5):\n");
        for (int fila = 0; fila < FILAS; fila++) {
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.print("  Valor [fila " + (fila + 1) + ", columna " + (col + 1) + "]: ");
                datos[fila][col] = teclado.nextInt();
            }
        }
    }
 
    private static void mostrarMatriz(int[][] datos) {
        System.out.println("\n--- Matriz ingresada ---");
        for (int fila = 0; fila < FILAS; fila++) {
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.printf("%6d", datos[fila][col]);
            }
            System.out.println();
        }
    }
}