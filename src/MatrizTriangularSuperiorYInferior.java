import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrizTriangularSuperiorYInferior{

    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int[][] leerMatriz(int filas, int columnas, char nombre) throws IOException {
        int[][] matriz = new int[filas][columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0; i < columnas; j++){
                            System.out.println("Escribe el valor de" + nombre + "[" + i +"][" + j +"]: ");
            entrada = buffer.readLine();
            matriz[i][j] = Integer.parseInt(entrada);
            }
        }
        return matriz;
    }

    public static void main(String[] args) throws Exception {
       
    }
}
