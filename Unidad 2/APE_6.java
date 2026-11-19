import java.util.Scanner;

public class APE_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaracion de variables
        float precio, descuento, monto_descuento, precio_final, triple;
        int valido = 0;

        System.out.println("=== Tienda de ropa ===");
        System.out.print("Ingrese el precio original: ");
        precio = teclado.nextFloat();
        System.out.print("Ingrese el porcentaje de descuento: ");
        descuento = teclado.nextFloat();

        // el descuento tiene que estar entre 0 y 100
        if (descuento >= 0 && descuento <= 100) {
            valido = 1;
        }

        if (valido == 1) {
            System.out.println("\nEl descuento es valido, calculando...");

            monto_descuento = precio * descuento / 100;
            precio_final = precio - monto_descuento;

            System.out.println("\n--- Desglose ---");
            System.out.printf("Precio original: %.2f\n", precio);
            System.out.printf("Descuento: %.2f%%\n", descuento);
            System.out.printf("Monto del descuento: %.2f\n", monto_descuento);
            System.out.printf("Precio final: %.2f\n", precio_final);

            // triple solo si el resultado es positivo
            if (precio_final > 0) {
                triple = precio_final * 3;
                System.out.printf("El triple del precio final es: %.2f\n", triple);
            } else {
                System.out.println("El precio final no es positivo, no se calcula el triple");
            }
        } else {
            System.out.println("\nError: el descuento debe estar entre 0 y 100");
        }

        System.out.println("\nFin del programa.");
    }
}
    