package Homework;

public class Main {
    public static void main(String[] args) {

        CarInfo CarInfo = new CarInfo("Skoda", "Octavia", "QFG456", "Martin", "Tamm");

        String carInfo = CarInfo.carInfoOutput();
        System.out.println(carInfo);

        //status - katki/paranduses/valmis
        // isPayed  - true/false
        CarCheck CarCheck = new CarCheck("katki", true);
    }
}
