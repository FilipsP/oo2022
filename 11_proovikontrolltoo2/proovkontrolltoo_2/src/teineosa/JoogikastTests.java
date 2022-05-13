package teineosa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JoogikastTests {

    @Test
    public void  arvutaMass(){
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca-cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        double mass = joogiKast.getMass(20);
        assertEquals(20.5, mass, 0.1);
    }


    @Test
    public void  arvutaMassKuiOnRohkemKuiMahub(){
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca-cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 20.0, 0.1);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        double mass = joogiKast.getMass(300);
        assertEquals(517.69, mass, 0.1);
    }

    @Test
    public void  villiPudelidKasti(){
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca-cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.1);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        Joogivaat joogivaat = new Joogivaat(312, 36);
        int kogus = joogiKast.villiKastiPudelid(joogivaat);
        assertEquals(20, kogus, 0.1);
    }


}
