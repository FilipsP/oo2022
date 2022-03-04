import java.util.ArrayList;
import java.util.List;

public class Arvud {
    List<Integer> arvudListis = new ArrayList<>();

    public Arvud(int arv1, int arv2, int arv3){
        arvudListis.add(arv1);
        arvudListis.add(arv2);
        arvudListis.add(arv3);
    }

    public void lisaArv(int arv){
        arvudListis.add(arv);
    }

    public List<Double> libisevKeskmine(){

        if (arvudKeskmisega.isEmpty()){
            for (int i = 0; i < arvudListis.size()-2; i++) {
                double uusNumber = (arvudListis.get(i)+arvudListis.get(i+1)+arvudListis.get(i+2))/3.0;
                doubles.add(uusNumber);
            }
            arvudKeskmisega = doubles;
        }else{
            if (arvudKeskmisega.size() == doubles.size()-2){
                return arvudKeskmisega;
            }else{

            }
        }
        return doubles;
    }
}
