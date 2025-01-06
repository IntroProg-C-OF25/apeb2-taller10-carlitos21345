/***
 * Ejercicio 6
 *Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3.
 *Permita a dos jugadores marcar sus movimientos alternativamente. 
 *El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        char jugadorActual = 'X';
        Scanner ingreso = new Scanner(System.in);
        int fila, columna;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        while (true) {
            imprimirTablero(tablero);
            System.out.println("Jugador " + jugadorActual + ", ingresa tu movimiento (fila y columna): ");

            fila = ingreso.nextInt() - 1;
            columna = ingreso.nextInt() - 1;

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ') {
                System.out.println("Movimiento no válido. Intenta de nuevo.");
                continue;
            }

            tablero[fila][columna] = jugadorActual;

            if (hayGanador(tablero, jugadorActual)) {
                imprimirTablero(tablero);
                System.out.println("Jugador " + jugadorActual + " ha ganado!");
                break;
            }

            if (esEmpate(tablero)) {
                imprimirTablero(tablero);
                System.out.println("¡Es un empate!");
                break;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
    }

    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----");
            }
        }
    }

    public static boolean hayGanador(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador)
                    || (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
                || (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }

    public static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
/***
 * run:
 | | 
-----
 | | 
-----
 | | 
 *Jugador X, ingresa tu movimiento (fila y columna): 
 *2
 *2
 | | 
-----
 |X| 
-----
 | | 
 *Jugador O, ingresa tu movimiento (fila y columna): 
 *2
 *3
 | | 
-----
 |X|O
-----
 | | 
 *Jugador X, ingresa tu movimiento (fila y columna): 
 *1
 *2
 |X| 
-----
 |X|O
-----
 | | 
 *Jugador O, ingresa tu movimiento (fila y columna): 
 *2
 *1
 |X| 
-----
O|X|O
-----
 | | 
 *Jugador X, ingresa tu movimiento (fila y columna): 
 *3
 *2
 |X| 
-----
O|X|O
-----
 |X| 
 *Jugador X ha ganado!
 *BUILD SUCCESSFUL (total time: 32 seconds)
 */