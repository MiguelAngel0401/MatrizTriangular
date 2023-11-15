import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrizTriangularSuperiorYInferior {

    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    // Craecion de las matrices.

    public static int[][] leerMatriz(int filas, int columnas, char nombre) throws IOException {
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Escribe el valor de " + nombre + "[" + i + "][" + j + "]: ");
                entrada = buffer.readLine();
                matriz[i][j] = Integer.parseInt(entrada);
            }
        }
        return matriz;
    }

    //Funcion para la Impresion de la matriz
    public static void imprimirMatriz(int[][] matriz, char nombre) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //Creacion de Matriz Superior
    public static boolean esTriangularSuperior(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //Creacion de matriz Inferior
    public static boolean esTriangularInferior(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int filas, columnas;

        //Solicitar el tipo de matriz

        System.out.println("Ingresa el tipo de Matriz? (Superior/Inferior):");
        entrada = buffer.readLine();
        String tipoMatriz = entrada.toLowerCase();

        // Solicitar filas y columnas 

        System.out.println("Ingresar el número de filas:");
        entrada = buffer.readLine();
        filas = Integer.parseInt(entrada);

        System.out.println("Ingresar el número de columnas:");
        entrada = buffer.readLine();
        columnas = Integer.parseInt(entrada);

        //Lectura de la matriz
        int[][] A = leerMatriz(filas, columnas, 'A');

        //Impresion de la matriz

        System.out.println("El tipo de Matriz:");
        imprimirMatriz(A, 'A');

        //Permite saber si es Matriz superior o inferior
        boolean esTriangularSuperior = esTriangularSuperior(A);
        boolean esTriangularInferior = esTriangularInferior(A);

        //Hace una comparacion para detrminar si es matriz inferior o superior

        if ("superior".equals(tipoMatriz) && esTriangularSuperior) {
            System.out.println("La matriz es Triangular Superior");
        } else if ("inferior".equals(tipoMatriz) && esTriangularInferior) {
            System.out.println("La matriz es Triangular Inferior");
        } else {
            System.out.println("La matriz no es del tipo solicitado");
        }
    }
}
