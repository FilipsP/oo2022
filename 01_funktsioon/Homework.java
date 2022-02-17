import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // Temperature converter
        Scanner celsiusInput = new Scanner(System.in);
        double celsius;
        System.out.println("Enter temperature in Celcius: ");
        celsius = celsiusInput.nextDouble();
        System.out.println("Temperature in fahrennheit:  " + ConvertTemperature(celsius));


    }

    public static double ConvertTemperature(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
