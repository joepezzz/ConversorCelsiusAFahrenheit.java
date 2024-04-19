import java.util.Scanner;

public class ConversorCelsiusAFahrenheit {
    public static void main(String[] args) {
        // Scanner para leer la entrada de los Celcius
        Scanner scanner = new Scanner(System.in);

        // Agregar la temperatura en Celcius
        System.out.print("Ingresa la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcular la temperatura en Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Muestra el resultado 
        int fahrenheitEntero = (int) fahrenheit;
        System.out.println("La temperatura en Fahrenheit (entero) es: " + fahrenheitEntero);

        // Cerrar el Scanner
        scanner.close();
    }
}
