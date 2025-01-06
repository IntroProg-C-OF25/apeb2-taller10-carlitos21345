
import java.util.Scanner;

/**
 * *
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar
 * su procesamiento para presentar los elementos: De la diagonal principal. De
 * la diagonal segundaria. Ubicados bajo la diagonal principal. Ubicados sobre
 * la diagonal principal. Ubicados bajo la diagonal secundaria. Ubicados sobre
 * la diagonal secundaria.
 */
public class Ejercicio1_DiagonalesdeMatriz {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int limMatriz = 0;
        System.out.print("Deme el limite de la matriz: ");
        limMatriz = ingreso.nextInt();
        int matriz[][] = new int[limMatriz][limMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("DIAGONAL PRINCIPAL OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nDIAGONAL PRNCIPAL EFICIENTE");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");

        }
        System.out.println("\nDIAGONAL SECUNDARIA OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nDIAGONAL SECUNDARIA EFICIENTE");
        for (int i = 0; i < matriz.length   ; i++) {
            System.out.print(matriz[i][matriz.length -i - 1 ]  + "\t");
        }
        System.out.println("\nFORMA  TRIANGULO OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i>j) {
                    System.out.print(matriz[i][j] + "\t");
                }
                
            }
            
        }
        System.out.println("\nFORMA  TRIANGULO eficiente");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
           
                    System.out.print(matriz[i][j] + "\t");
                }
                
            }
        }
    }

