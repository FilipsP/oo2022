import java.util.List;

public class LastChar {
    String[] words;
    String cleanText;
    String allLastChars = "";

    public LastChar(String text){
       cleanText = text.replaceAll("\\p{Punct}", "");
       words = cleanText.split(" ");
        System.out.println("Words in text - " + words.length);

        for (int i = 0; i < words.length; i++) {
            String lastChar = words[i].substring(words[i].length() - 1);
             allLastChars = allLastChars + lastChar;
        }

    }

}
