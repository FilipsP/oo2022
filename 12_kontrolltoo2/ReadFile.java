import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ReadFile {

    String filename;
    String text;

    public ReadFile(String fileName) throws IOException {
        this.filename = fileName;


        Path path = Path.of(filename);
        text = Files.readString(path);
        System.out.println(text);


    }

}
