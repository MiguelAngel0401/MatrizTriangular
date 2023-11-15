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

    public static void imprimirMatriz(int[][] matriz, char nombre){
        for(int i = 0; i < matriz.length; i++){
            for( int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(entrada);
        }
    }

    public static boolean esTriangularSuperior(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                if (matriz[i][j] !=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esTriangularInferior(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = i + 1; j < matriz[i].length; j++){
                if(matriz[i][j] !=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int filas, columnas;

        System.out.println("Que tipo de matriz quieres usas? (superior/inferior):");
        entrada = buffer.readLine();
        String tipoMatriz = entrada.toLowerCase();

        System.out.println("Ingresar el nuemro de filas:");
        entrada = buffer.readLine();
        filas = Integer.parseInt(entrada);

        System.out.println("Ingresar el numero de columnas:");
        entrada = buffer.readLine();
        columnas = Integer.parseInt(entrada);

        int[][] A = leerMatriz(filas, columnas, 'A');

        System.out.println("Las Matrices");
        imprimirMatriz(A, 'A');

        boolean esTriangularSuperior = esTriangularSuperior(A);
        boolean esTriangularInferior = esTriangularInferior(A);

        if("MatrizSuperior" == tipoMatriz && esTriangularSuperior){
            System.out.println("La matriz es Triangular Superior");
        } else if {
            ("MatrizInferior" == tipoMatriz && esTriangularInferior){
                System.out.println("La matriz es Triangular Inferior");
            } else{
                System.out.println("La matriz no es correcta");
            }
        }
    }
}
