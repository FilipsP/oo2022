package Homework;
import java.util.Scanner;

public class ConverterMain {
    public static void main(String[] args) {
        System.out.println("Choose unit for convertion (mass/temperature) :");
        Scanner unitInput = new Scanner(System.in);
        String choosedUnit = unitInput.nextLine();

        if (choosedUnit.equals("mass")){
            System.out.println("Enter weight in kg: ");
            double massInput = unitInput.nextDouble();
            Mass mass = new Mass(massInput);

        }
        if (choosedUnit.equals("temperature")){
            System.out.println("Enter temperature in Celcius: ");
            double temperatureInput = unitInput.nextDouble();
            Temperature  temperature = new Temperature(temperatureInput);
        }
    }
}
