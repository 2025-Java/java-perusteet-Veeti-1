package viikko1;

public class PasswordAttempts {
    
    public static String login(String[] tries) {
        // TODO
        String oikein = "java123";
        String s = "Tervetuloa!";
        String fail = "Liian monta virheellistä yritystä.";
        
        
            for(int i = 0; i<tries.length && i<3; i++){
            if(tries[i].equals(oikein)){
                return s;
            }

        }
        return fail;
    }
}
