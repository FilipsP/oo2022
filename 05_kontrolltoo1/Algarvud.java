import java.util.Scanner;

public class Algarvud {
    public static void main(String[] args) {
        System.out.println("Sisestage arv");
        Scanner scanner = new Scanner(System.in);
        int arv = scanner.nextInt();
        //System.out.println("Arv - " + arv);


        // kas jagub 2,3,5 või 7ga
        if (arv % 2 == 0) {
            System.out.println("Arv jagub kahega");
        }
        if (arv % 3 == 0) {
            System.out.println("Arv jagub kolmega");
        }
        if (arv % 5 == 0) {
            System.out.println("Arv jagub viiega");
        }
        if (arv % 7 == 0) {
            System.out.println("Arv jagub seitsmega");
        }

        // kas on algarv
        boolean kasOnAlgarv = false;
        String vastus;
        if(arv <= 1) {
            kasOnAlgarv = false;
        }
        for(int i = 2; i <= arv; i++){
            if(arv % i == 0){
                kasOnAlgarv = true;
                break;
            }
        }

        if (!kasOnAlgarv){
            System.out.println(arv + "  on algarv");
        }else{
            System.out.println(arv + " ei ole algarv");
        }

    }




}
