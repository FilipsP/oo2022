package teineosa;

public class Joogivaat {
    double ruumala;
    double liitritesJooki;

    public Joogivaat(double ruumala, double liitresJooki) {
        this.ruumala = ruumala;
        this.liitritesJooki = liitresJooki;
    }

    public boolean t2idaJoogiPudel(JoogiPudel joogiPudel){
        if(liitritesJooki >= joogiPudel.maht){
            System.out.print("Jooki mahub!");
            return true;
        }else{
            System.out.print("Joogi ei mahu!");
            return false;
        }
    }


    public int villiPudelid(JoogiPudel joogiPudel){
        int loendur = 0;
        while(liitritesJooki >= joogiPudel.maht){
            // liitritesJooki = liitritesJooki - joogiPudel.maht;
            liitritesJooki -= joogiPudel.maht;
            loendur++;
        }
        System.out.print("Villisid " + loendur + " jooki");
        return loendur;
    }

}
