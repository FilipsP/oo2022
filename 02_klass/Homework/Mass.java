package Homework;
public class Mass {
    double kilogram;
    double tonne;
    double gram;
    double pound;
    double ounce;

    public Mass(double massInput) {
        kilogram = massInput;
        tonne = kilogram/1000;
        gram = kilogram * 1000;
        pound = kilogram * 2.205;
        ounce = kilogram * 32.274;
        massOutput(tonne, gram, pound, ounce);
    }

    public void massOutput(double tonne, double gram, double pound, double ounce){
        System.out.println("Mass in tonns: " + tonne);
        System.out.println("Mass in grams: " + gram);
        System.out.println("Mass in pounds: " + pound);
        System.out.println("Mass in ounces: " + ounce);
    }

}
