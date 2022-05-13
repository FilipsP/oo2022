import java.lang.reflect.Array;
import java.util.Arrays;

public class SortChars {
    public SortChars(String allLastChars) {
        char[] chars = allLastChars.toCharArray();
        int[] frequency = new int[chars.length];
        int max = frequency[0];
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1;
            for (int j = i+1; j < chars.length; j++) {
                if(chars[i] == chars[j]){
                    frequency[i]++;
                    chars[j] = '0';

                }
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if(chars[i] != '0' && chars[i] != ' ') {
               System.out.println(chars[i] + " - " + frequency[i]);
            }
        }

        }
    }

