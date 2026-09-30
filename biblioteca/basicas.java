package biblioteca;

import java.util.Scanner;

public class basicas {
    //funcion que pide una matriz de enteros por teclado
    public static int[][] fillFromKeyboard(int rows, int cols) {
        Scanner sc = new Scanner(System.in);
            int[][] array = new int[rows][cols];
            System.out.println("Añade: " + (rows * cols) + " numeros");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.println("Elemento [" + i + "][" + j + "]");
                    array[i][j] = sc.nextInt();
                }
            }
        return array;
    }

    //funcion que traspone una matriz de enteros
    public static int[][] transpose(int[][] array) {
        
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = array[i][j];
            }
        }

        return transposed;
    }

    public static int trace(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows != cols) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular la traza");
        }

        int trace = 0;
        for (int i = 0; i < rows; i++) {
            trace += array[i][i];
        }
        return trace;
    }

    public static boolean esSimetrica(int[][] array) {
        // Validar si la matriz no es nula ni está vacía
        if (array == null || array.length == 0) {
            return false;
        }

        int n = array.length;

        // 1. Comprobar si es cuadrada
        for (int i = 0; i < n; i++) {
            if (array[i] == null || array[i].length != n) {
                return false; // Si alguna fila no coincide con 'n', no es cuadrada
            }
        }

        // 2. Comprobar la simetría (solo recorremos los elementos por encima de la diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i][j] != array[j][i]) {
                    return false; // Al encontrar la primera diferencia, sabemos que no es simétrica
                }
            }
        }

        return true; // Pasó todas las comprobaciones correctamente
    }

    //funcion que imprime una matriz
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static boolean verificarFueraDiagonal(int[][] array) {
        // Validar si la matriz no es nula ni está vacía
        if (array == null || array.length == 0) {
            return false;
        }

        int numFilas = array.length;

        // 1. Comprobar si es cuadrada
        for (int i = 0; i < numFilas; i++) {
            if (array[i] == null || array[i].length != numFilas) {
                return false; // Si alguna fila no coincide con 'n', no es cuadrada
            }
        }

        // 2. Recorrer la matriz para verificar los elementos fuera de la diagonal
        for (int k = 0; k < numFilas; k++) {
            for (int k2 = 0; k2 < numFilas-1; k2++) {
                if (k != k2) {
                    if (array[k][k2] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}