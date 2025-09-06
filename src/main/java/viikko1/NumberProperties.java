package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if(n>0){ // tarkistaa onko luku positiivinen
            if(n%2==0){ //tarkistaa onko parillinen
                    String posparr = "positiivinen parillinen";
                    return posparr;
            }else{
            String pospar = "positiivinen pariton";
            return pospar;

            } 
        }if(n<0){ //tarkistaa onko luku negatiivinen
                if(n%2==0){// tarkistaa onko luku parillinen
            String negpar = "negatiivinen parillinen";
            return negpar;
                    
                }else{
            String negparls = "negatiivinen pariton";
            return negparls;

                }
            }
            else if(n == 0){//tarkistaa onko luku nolla
                String nolla = "nolla";
                return nolla;
            //System.out.println("nolla");

            }
        return null;
    }
}
