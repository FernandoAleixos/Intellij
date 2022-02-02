package Matrices;

import java.util.Arrays;

public class _3_Utiles {

    //Muestra por pantalla los elementos de la diagonal
    public static void mostrarDiagonal(int[][] m) {
        String separador = "";
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (f == c) {
                    System.out.print(separador + m[f][c] + "\n");
                    separador += "\t";
                }
            }
        }
    }

    //Devuelve la fila en que se encuentra el mayor elemento de la matriz
    public static int filaDelMayor(int[][] m) {
        int numMayor = 0;
        int filaNumMayor = 0;

        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c] > numMayor) {
                    numMayor = m[f][c];
                    filaNumMayor = f;
                }
            }
        }
        return filaNumMayor;
    }

    //Intercambia los elementos de las filas
    public static void intercambiarFilas(int[][] m, int f1, int f2) {
        int aux = 0;
        System.out.println(Arrays.deepToString(m));

        for (int c = 0; c < m[0].length; c++) {
            aux = m[f1][c];
            m[f1][c] = m[f2][c];
            m[f2][c] = aux;
        }
        System.out.println(Arrays.deepToString(m));
    }


    public static boolean esSimetrica(int[][] m) {
        boolean simetrico = false;

        for (int c = 0; c < m[0].length; c++) {
            if (m[0][c] == m[c][0]) {
                simetrico = true;
            }
        }

        return simetrico;
    }

    public static void main(String[] args) {
        int[][] simetria = {{0, 1, 2, 3},
                            {1, 2, 3, 4},
                            {2, 3, 4, 5},
                            {3, 4, 5, 6}};

        //mostrarDiagonal(simetria);
        //System.out.println(filaDelMayor(simetria));
        //intercambiarFilas(simetria, 1, 3);
        System.out.println(esSimetrica(simetria));
    }
}
