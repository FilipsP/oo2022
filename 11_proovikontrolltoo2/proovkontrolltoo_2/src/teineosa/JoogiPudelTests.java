package teineosa;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoogiPudelTests {

    // punane -> alt enter -> add junit4 to classpath
    @Test
    public void arvutakoguMassKuiJookiPole(){
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);

        double mass = joogiPudel.getMass();
        assertEquals(20.0, mass, 0.1);
    }

    @Test
    public void arvutakoguMassKuiJookOn(){
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        Jook coca = new Jook("Coca-cola", 0.6, 1.4);
        joogiPudel.jook = coca;
        double mass = joogiPudel.getMass();
        assertEquals(28.0, mass, 0.1);
    }


    @Test
    public void arvutakoguHindKuiJookiPole(){
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);

        double hind = joogiPudel.getKoguHind();
        assertEquals(0.2, hind, 0.1);
    }



    @Test
    public void arvutakoguHindKuiJookOn(){
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        Jook coca = new Jook("Coca-cola", 0.6, 1.4);
        joogiPudel.jook = coca;
        double hind = joogiPudel.getKoguHind();
        assertEquals(1.04, hind, 0.1);
    }


}
