import java.util.Scanner;

public class ConversionNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("El número " + numero + " en binario es: " + Integer.toBinaryString(numero));
        System.out.println("El número " + numero + " en octal es: " + Integer.toOctalString(numero));
        System.out.println("El número " + numero + " en hexadecimal es: " + Integer.toHexString(numero));

        scanner.close();
    }
}

