package isikukood;
import kujundid.Kolmnurk;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4(){
        IsikukoodEE ee = new IsikukoodEE("4513112313");
        assertEquals(false,ee.isMale());
    }

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_kesksel_on_51(){
        IsikukoodLV lv = new IsikukoodLV("120388-51237");
        assertEquals(1951,lv.getBirthMonth());
    }

    @Test
    public void konntrolli_kas_kujundi_pindala_arvutakse_korrektselt(){
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(18, kolmnurk.arvutaPindala(), 0.1);
    }
}
