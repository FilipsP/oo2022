package Homework;

public class CarCheck {
    String status;
    boolean isPayed;

    public CarCheck(String carInfo, String status, boolean isPayed){
        this.status = status;
        this.isPayed = isPayed;

        if (isPayed){
            switch (status){
                case "katki":
                    System.out.println(carInfo + " ootab remonti!");
                    break;
                case "paranduses":
                    System.out.println(carInfo + " on paranduses!");
                    break;
                case "valmis":
                    System.out.println(carInfo + " ootab teid!");
                    break;
            }

        }else{
            System.out.println(carInfo + " - Palun makske remondi eest !");
        }

    }

}
