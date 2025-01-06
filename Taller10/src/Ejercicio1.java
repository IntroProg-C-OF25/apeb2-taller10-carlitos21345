
/** *
 * EJERCICIO 1
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios,
 * desarrollar su procesamiento para presentar los elementos:
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int lim = 0;
        System.out.print("INGRESE EL LIMIITE DE LA MATRIZ: ");
        lim = ingreso.nextInt();
        int matriz[][] = new int[lim][lim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println("DIAGONAL PRINCIPAL  ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println();
        System.out.println("DIAGONAL SECUNDARIA");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - i - 1] + "\t");

        }
        System.out.println();
        System.out.println("UBICADOS BAJO LA DIAGONAL PRINCIPAL");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

        }
        System.out.println();
        System.out.println("ELEMENTOS SOBRE LA DIAGONAL PRINCIPAL");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");

            }

        }
        System.out.println();
        System.out.println("ELEMENTOS SOBRE LA DIAGONAL SECUNDARIA");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length - i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

        }
        System.out.println();
        System.out.println("ELEMENTOS BAJO LA DIAGONAL SECUNDARIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1; j > matriz.length - i - 1; j--) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println();
    }
}
/***
 * run:
 *INGRESE EL LIMIITE DE LA MATRIZ: 3
 *0	8	5	
 *5	0	8	
 *5	1	1	
 *DIAGONAL PRINCIPAL  
 *0	0	1	
 *DIAGONAL SECUNDARIA
 *5	0	5	
 *UBICADOS BAJO LA DIAGONAL PRINCIPAL
 *5	5	1	
 *ELEMENTOS SOBRE LA DIAGONAL PRINCIPAL
 *8	5	8	
 *ELEMENTOS SOBRE LA DIAGONAL SECUNDARIA
 *5	0	5	
 *ELEMENTOS BAJO LA DIAGONAL SECUNDARIA
 *8	1	1	
 *BUILD SUCCESSFUL (total time: 5 seconds)
 */