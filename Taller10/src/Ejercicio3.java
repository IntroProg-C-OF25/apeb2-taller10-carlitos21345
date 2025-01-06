
import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Random random = new Random();

        double acd, ape, aa, sumTotal = 0, prom, promGeneral, mayorProm = 0, menorProm = 10;
        String Estumayor = null, Estumenor = null;
        int Numestu = 28;

        String[] nombres = new String[Numestu];
        double[][] estudiante = new double[Numestu][4];
        for (int i = 0; i < Numestu; i++) {
            System.out.print("INGRESE EL NOMBRE DEL ESTUDIANTE: " + (i + 1) + ":");
            nombres[i] = ingreso.nextLine();
            estudiante[i][0] = random.nextDouble() * 10;
            estudiante[i][1] = random.nextDouble() * 10;
            estudiante[i][2] = random.nextDouble() * 10;
        }
        for (int i = 0; i < Numestu; i++) {
            prom = (estudiante[i][0] + estudiante[i][1] + estudiante[i][2]) / 3;
            sumTotal += prom;
        }
        promGeneral = sumTotal / Numestu;
        System.out.println("EL PROMEDIO GENERAL DEL CURSO ES " + String.format("%.2f" , promGeneral));

        for (int i = 0; i < Numestu; i++) {
            prom = (estudiante[i][0] + estudiante[i][1] + estudiante[i][2]) / 3;
            if (prom > mayorProm) {
                mayorProm = prom;
                Estumayor = nombres[i];
            }
            if (prom < menorProm) {
                menorProm = prom;
                Estumenor = nombres[i];
            }
        }
        System.out.println("\nTABLA DE ESTUDIANTES:");
        System.out.printf("%-20s %-10s %-10s %-10s %-10s\n", "NOMBRE", "NOTA 1", "NOTA 2", "NOTA 3", "PROMEDIO");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < Numestu; i++) {
            prom = (estudiante[i][0] + estudiante[i][1] + estudiante[i][2]) / 3;
            System.out.printf("%-20s %-10.2f %-10.2f %-10.2f %-10.2f\n",
                    nombres[i], estudiante[i][0], estudiante[i][1], estudiante[i][2], prom);
        }

        System.out.println("\nESTUDIANTE CON MAYOR PROMEDIO ES: " + Estumayor + " CON UN PROMEDIO DE: " + String.format("%.2f", mayorProm));
        System.out.println("ESTUDIANTE CON EL PROMEDIO MAS BAJO ES: " + Estumenor + " CON UN PROMEDIO DE: " + String.format("%.2f", menorProm));
    }
}
/***
 * run:
INGRESE EL NOMBRE DEL ESTUDIANTE: 1:Carlos
INGRESE EL NOMBRE DEL ESTUDIANTE: 2:Jose
INGRESE EL NOMBRE DEL ESTUDIANTE: 3:Ruben
INGRESE EL NOMBRE DEL ESTUDIANTE: 4:Maria
INGRESE EL NOMBRE DEL ESTUDIANTE: 5:Stefania
INGRESE EL NOMBRE DEL ESTUDIANTE: 6:Domenica
INGRESE EL NOMBRE DEL ESTUDIANTE: 7:Lizeth
INGRESE EL NOMBRE DEL ESTUDIANTE: 8:Daniela
EL PROMEDIO GENERAL DEL CURSO ES 4,57

TABLA DE ESTUDIANTES:
NOMBRE               NOTA 1     NOTA 2     NOTA 3     PROMEDIO  
-----------------------------------------------------------------
Carlos               3,04       0,11       0,32       1,15      
Jose                 7,68       7,90       3,92       6,50      
Ruben                4,17       3,83       2,19       3,40      
Maria                3,32       6,52       8,48       6,11      
Stefania             9,91       2,21       1,72       4,61      
Domenica             1,02       5,92       3,68       3,54      
Lizeth               9,83       8,96       8,08       8,95      
Daniela              1,62       4,00       1,35       2,32      

ESTUDIANTE CON MAYOR PROMEDIO ES: Lizeth CON UN PROMEDIO DE: 8,95
ESTUDIANTE CON EL PROMEDIO MAS BAJO ES: Carlos CON UN PROMEDIO DE: 1,15
 *BUILD SUCCESSFUL (total time: 23 seconds)
 * Le hize con 8 para que el procedimiento hacerlo mas rapido pero en si hay como actualizar 
 * el numero de estudiantes que necesitemos en la variable Numestu que vendria hacer la cantidad de estudiantes 
 * que vamos a tener sus datos.
 */