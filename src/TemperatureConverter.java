import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().charAt(0);

        // Convert temperature based on the provided unit
        double convertedTemperatureCelsius = convertToCelsius(temperature, unit);
        double convertedTemperatureFahrenheit = convertToFahrenheit(convertedTemperatureCelsius);
        double convertedTemperatureKelvin = convertToKelvin(convertedTemperatureCelsius);

        // Display the converted temperatures
        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + convertedTemperatureCelsius + " °C");
        System.out.println("Fahrenheit: " + convertedTemperatureFahrenheit + " °F");
        System.out.println("Kelvin: " + convertedTemperatureKelvin + " K");

        // Close the scanner to release resources
        scanner.close();
    }

    // Convert temperature to Celsius
    private static double convertToCelsius(double temperature, char originalUnit) {
        switch (Character.toUpperCase(originalUnit)) {
            case 'C':
                return temperature;
            case 'F':
                return (temperature - 32) * 5 / 9;
            case 'K':
                return temperature - 273.15;
            default:
                throw new IllegalArgumentException("Invalid unit of measurement");
        }
    }

    // Convert temperature to Fahrenheit
    private static double convertToFahrenheit(double temperatureCelsius) {
        return (temperatureCelsius * 9 / 5) + 32;
    }

    // Convert temperature to Kelvin
    private static double convertToKelvin(double temperatureCelsius) {
        return temperatureCelsius + 273.15;
    }
}
