import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algarvud {
    public static void main(String[] args) {
        //List<Integer> algarvud = new ArrayList<>();
        int esimene = 2;
        int viimane = 7919;

        System.out.println("Sisestage arv");
        Scanner scanner = new Scanner(System.in);
        int arv = scanner.nextInt();

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
        if (!kasOnAlgarv(arv)) {
            System.out.println(arv + "  on algarv");
        } else {
            System.out.println(arv + " ei ole algarv");
        }

        // esimese tuhande algarvuga massiiv
        massiiv(esimene, viimane);
    }


    public static boolean kasOnAlgarv(int arv) {
        if (arv <= 1) {
            return false;
        }
        for (int i = 2; i <= arv; i++) {
            if (arv % i == 0) {
                return true;
            }
        }
    return true;
    }

    public static void massiiv(int esimene, int viimane){
        List<Integer> algarvud = new ArrayList<>();

        for (int i = esimene; i <= viimane; i++) {
            if (kasOnAlgarv(i)){
                algarvud.add(i);
            }
        }
        //System.out.println(algarvud);
    }



}