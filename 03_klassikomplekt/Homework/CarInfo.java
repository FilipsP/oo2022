package Homework;

public class CarInfo {
    String manufacturer;
    String model;
    String carCode;
    String ownerFirstName;
    String ownerLastName;



    public CarInfo(String manufacturer, String model, String carCode, String ownerFirstName, String ownerLastName){
        this.manufacturer = manufacturer;
        this.model = model;
        this.carCode = carCode;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;

    }

    public String carInfoOutput(){
        return (ownerFirstName + " " + ownerLastName + " - Teie auto (" + manufacturer + "," + model + "," + carCode + ")");

    }

}
