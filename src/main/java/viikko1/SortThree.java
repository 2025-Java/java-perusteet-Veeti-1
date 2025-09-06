package viikko1;

import java.util.Arrays;

public class SortThree {
    public static String ascending(int a, int b, int c) {
     

      int [] numbers = new int[] {a,b,c}; //luo taulukon a,b,c
        Arrays.sort(numbers); //asettelee luvut
        String vastaus =  Arrays.toString(numbers); //muuntaa stringiksi
         vastaus = vastaus.replaceAll("\\s+", ""); // poistaa turhat välilyönnit
        vastaus = vastaus.replace("[", "").replace("]","");//poistaa []
        return vastaus;
    }
}
