import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FailiKirjutamine {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("valjund.txt"));
        pw.println("Tere!");
        pw.print(" Juku");
        pw.close();
    }
}
