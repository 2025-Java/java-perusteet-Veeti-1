package viikko1;

import java.util.Arrays;

public class SortThree {
    public static String ascending(int a, int b, int c) {
     

      int [] numbers = new int[] {a,b,c};
        Arrays.sort(numbers);
        String vastaus =  Arrays.toString(numbers);
         vastaus = vastaus.replaceAll("\\s+", "");
        vastaus = vastaus.replace("[", "").replace("]","");
        return vastaus;
    }
}
