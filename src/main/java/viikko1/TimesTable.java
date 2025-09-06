package viikko1;

public class TimesTable {
    public static String table(int n) {
        // TODO
        
        StringBuilder s = new StringBuilder();
        
        for(int i= 1; i<=10;i++){
        
        s.append(n+""+" x "+i+""+" = "+""+(n*i)+"\n");

        }
     
        return s.toString();
    }
}
