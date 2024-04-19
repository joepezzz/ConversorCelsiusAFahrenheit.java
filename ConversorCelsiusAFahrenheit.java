import java.util.Scanner;

public class ConversorCelsiusAFahrenheit {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura en Celsius
        System.out.print("Ingresa la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcular la temperatura en Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Mostrar el resultado con dos decimales
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        // Mostrar el resultado sin decimales (como un entero)
        int fahrenheitEntero = (int) fahrenheit;
        System.out.println("La temperatura en Fahrenheit (entero) es: " + fahrenheitEntero);

        // Cerrar el Scanner
        scanner.close();
    }
}
