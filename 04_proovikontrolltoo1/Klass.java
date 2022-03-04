import java.util.List;

public class Klass {
   // Integer[] xCoords;
    // Integer[] yCoords;
    List<Integer> xCoords;
    List<Integer> yCoords;

    public void setxCoords(int x1, int x2, int x3){
        xCoords.add(x1);
        xCoords.add(x2);
        xCoords.add(x3);
    }

    public void setyCoords(int y1, int y2, int y3){
        xCoords.add(y1);
        xCoords.add(y2);
        xCoords.add(y3);
    }

    @Override
    public String toString() {
        return "Klass{" +
                "xCoords=" + xCoords +
                ", yCoords=" + yCoords +
                '}';
    }
}
