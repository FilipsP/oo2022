import java.io.IOException;

public class Main {
    /*
     +  Trüki välja sõnade viimased tähed

     * Väljasta erinevad sõnalõputähed nende esinemissageduse järjekorras

     * Iga lõputähega sõnade jaoks on eraldi fail, kuhu need tekstist kirjutatakse.

        Luuakse uus fail viidetega tekstis esinenud lõputähtedega failidele, iga viite juures arv,
        mitu korda vastava lõputähega sõna esines.
     *
     */
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("text.txt");
        LastChar lastChar = new LastChar(readFile.text);
        SortChars sortChars = new SortChars(lastChar.allLastChars);

    }
}


