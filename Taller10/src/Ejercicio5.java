/***
 * Ejercicio 5
 *Crea un programa que gestione el inventario de una tienda, 
 * así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar 
 * los productos disponibles en la tienda, con información como nombre, precio y cantidad. 
 * El programa debe permitir facturar un producto dado su código, y unidades deseadas.
 * Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100,
 * se debe aplicar un descuento.
 *Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 */
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        String[][] productos = {
            {"001", "Cloro", "1.50", "100"},
            {"002", "Alcohol", "2.00", "50"},
            {"003", "Detergente", "3.00", "30"},
            {"004", "Shampoo", "7.50", "200"},
            {"005", "Fabuloso", "3.50", "150"},
            {"006", "Sarrolin", "10.00", "45"},
            {"007", "Jabon para trastes", "4.00", "50"}

        };

        Scanner ingreso = new Scanner(System.in);
        double totalCompra = 0.0, precio, subtotal,iva, descuento;
        int cantidad, indice, disponible;

        System.out.println("Bienvenido a la tienda.");
        mostrarInventario(productos);

        while (true) {
            System.out.print("\nIngrese el codigo del producto (o presione 'salir'): ");
            String codigo = ingreso.nextLine();
            if (codigo.equalsIgnoreCase("salir")) {
                break;
            }

             indice = buscarProducto(productos, codigo);
            if (indice == -1) {
                System.out.println("Producto no encontrado.");
                continue;
            }

            System.out.print("Ingrese la cantidad deseada: ");
             cantidad = ingreso.nextInt();
            ingreso.nextLine();

             disponible = Integer.parseInt(productos[indice][3]);
            if (cantidad > disponible) {
                System.out.println("Cantidad no disponible.");
            } else {
                 precio = Double.parseDouble(productos[indice][2]);
                 subtotal = cantidad * precio;
                totalCompra += subtotal;
                productos[indice][3] = String.valueOf(disponible - cantidad);
                System.out.printf("Subtotal: $%.2f\n", subtotal);
            }
        }

         iva = totalCompra * 0.15;
         descuento = (totalCompra > 100) ? totalCompra * 0.10 : 0.0;
        System.out.printf("\nFactura:\nTotal compra: $%.2f\nIVA: $%.2f\nDescuento: $%.2f\nTotal a pagar: $%.2f\n",
                totalCompra, iva, descuento, totalCompra + iva - descuento);

    }

    public static int buscarProducto(String[][] productos, String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0].equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public static void mostrarInventario(String[][] productos) {
        System.out.println("Codigo  Nombre   Precio  Cantidad");
        for (int i = 0; i < productos.length; i++) {
            String[] p = productos[i];
            System.out.printf("%s       %s     $%s      %s\n", p[0], p[1], p[2], p[3]);
        }
    }
}
/***
 * run:
 *Bienvenido a la tienda.
 *Codigo  Nombre   Precio  Cantidad
 *001       Cloro     $1.50      100
 *002       Alcohol     $2.00      50
 *003       Detergente     $3.00      30
 *004       Shampoo     $7.50      200
 *005       Fabuloso     $3.50      150
 *006       Sarrolin     $10.00      45
 *007       Jabon para trastes     $4.00      50

 *Ingrese el codigo del producto (o presione 'salir'): 001
 *Ingrese la cantidad deseada: 50
 *Subtotal: $75,00

 *Ingrese el codigo del producto (o presione 'salir'): 006
 *Ingrese la cantidad deseada: 45
 *Subtotal: $450,00

 *Ingrese el codigo del producto (o presione 'salir'): salir

 *Factura:
 *Total compra: $525,00
 *IVA: $78,75
 *Descuento: $52,50
 *Total a pagar: $551,25
 *BUILD SUCCESSFUL (total time: 25 seconds)
 */