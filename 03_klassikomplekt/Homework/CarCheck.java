package Homework;

public class CarCheck {
    String status;
    boolean isPayed;

    public CarCheck(String status, boolean isPayed){
        this.status = status;
        this.isPayed = isPayed;

        if (isPayed){
            switch (status){
                case "katki":
                    System.out.println("Auto ootab remonti!");
                    break;
                case "paranduses":
                    System.out.println("Auto on paranduses!");
                    break;
                case "valmis":
                    System.out.println("Teie auto ootab teid!");
                    break;
            }

        }else{
            System.out.println("Palun makske remondi eest !");
        }

    }

}
