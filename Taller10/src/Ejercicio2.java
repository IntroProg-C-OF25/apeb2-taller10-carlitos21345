/***
 * Ejercicio 2
 *Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, 
 * desarrollar su procesamiento para calcular y presentar:
 *La suma de las dos matrices (considerar las restricciones matemáticas para ello).
 *La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int lim1 = 0, lim2 = 0;
        System.out.print("INGRESE EL LIMITE DE LA MATRIZ 1: ");
        lim1 = ingreso.nextInt();
        int matriz1[][] = new int[lim1][lim1];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("INGRESE EL LIMITE DE LA MATRIZ 2: ");
        lim2 = ingreso.nextInt();
        int matriz2[][] = new int[lim2][lim2];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
                     
            System.out.println();
        }
        int sumatrices[][] = new int[lim1][lim1];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                sumatrices[i][j] = matriz1[i][j] + matriz2[i][j];
                
            }
            
        }
        System.out.println("LA SUMA DE LAS DOS MATRICES ES: ");
        for (int i = 0; i < sumatrices.length; i++) {
            for (int j = 0; j < sumatrices[0].length; j++) {
                System.out.print(sumatrices[i][j] + "\t");
            }
            System.out.println();
        }
        int multimatri[][] = new int[lim1][lim1];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                multimatri[i][j] = matriz1[i][j] * matriz2[i][j];
            }
            
        }
        System.out.println("LA MULTIPLICACION DE LAS DOS MATRICES ES: ");
        for (int i = 0; i < multimatri.length; i++) {
            for (int j = 0; j < multimatri[0].length; j++) {
                System.out.print(multimatri[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
/***
 * run:
 *INGRESE EL LIMITE DE LA MATRIZ 1: 3
 *5	8	7	
 *6	3	0	
 *1	8	6	
 *INGRESE EL LIMITE DE LA MATRIZ 2: 3
 *1	4	3	
 *5	5	5	
 *7	4	3	
 *LA SUMA DE LAS DOS MATRICES ES: 
 *6	12	10	
 *11	8	5	
 *8	12	9	
 *LA MULTIPLICACION DE LAS DOS MATRICES ES: 
 *5	32	21	
 *30	15	0	
 *7	32	18	
 *BUILD SUCCESSFUL (total time: 15 seconds)
 */