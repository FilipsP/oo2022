import java.awt.event.WindowFocusListener;

public class Main {
    public static void main(String[] args) {
        //Arvuti arvuti = new Arvuti(new Info("abc", "intel", "rd",1,1), 2000);
        Info info = new Info("abc", "intel", "rd",1,1);
        Arvuti arvuti = new Arvuti(info, 2000);

        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo);

    }
}
