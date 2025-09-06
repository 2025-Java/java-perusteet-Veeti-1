package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if(n>0){
            if(n%2==0){
                    String posparr = "positiivinen parillinen";
                    return posparr;
            }else{
            String pospar = "positiivinen pariton";
            return pospar;

            } 
        }if(n<0){
                if(n%2==0){
            String negpar = "negatiivinen parillinen";
            return negpar;
                    
                }else{
            String negparls = "negatiivinen pariton";
            return negparls;

                }
            }
            else if(n == 0){
                String nolla = "nolla";
                return nolla;
            //System.out.println("nolla");

            }
        return null;
    }
}
