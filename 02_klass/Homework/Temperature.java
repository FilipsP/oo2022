package Homework;
public class Temperature {
    double celcius;
    double fahrennheit;
    double kelvin;

    public Temperature(double temperatureInput) {
        celcius = temperatureInput;
        fahrennheit = (celcius * 1.8) + 32;
        kelvin = celcius + 273.15;
        temperatureOutput(celcius, fahrennheit, kelvin);
    }


    public void temperatureOutput(double celcius, double fahrennheit, double kelvin){
        System.out.println("Temperature in fahrennheit: " + fahrennheit);
        System.out.println("Temperature in kelvin: " + kelvin);
    }



}
