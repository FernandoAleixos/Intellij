package Matrices;

public class _2_Ventas {
    public static int mejorDistribuidor(int[][] m) {
        int sumador = 0;
        int max = 0;

        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                sumador += m[c][f];
                max = sumador;
                if (sumador > max) {
                    return sumador;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] productos = {{12, 13, 14, 15, 16, 17, 18, 19, 20, 21},
                {16, 18, 20, 22, 24, 26, 28, 30, 32, 34},
                {17, 19, 21, 23, 25, 27, 29, 31, 33, 35},
                {18, 20, 22, 24, 26, 28, 30, 32, 34, 36},
                {19, 21, 23, 25, 27, 29, 31, 33, 35, 37}};

        int[] precioProductos = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.println(mejorDistribuidor(productos));
    }
}
