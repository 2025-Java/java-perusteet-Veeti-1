package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        // TODO
            double average = 0.0;
            double summa = 0.0;
            if(arr.length != 0){
                int maara = arr.length; // katsoo kuinka pitkä/kuinka paljon lukuja on 
                for(int i : arr){//käy arr läpi
                    summa+=i; //lisää summaan kaikki luvut arr sisällä
                }
                average = summa/maara; //laskee keskiarvon
                return average; // palauttaa keskiarvon
            }
        
        return 0.0;
        
    }
    public static int max(int[] arr) {
        // TODO
        int maximi = arr[0];
        if(arr.length !=0){ //tarkistaa että arrayssa on lukuja
            for(int i = 0; i<arr.length; i++){
                if(arr[i]>maximi){
                    maximi = arr[i];
                    return maximi; //palauttaa maximi arvon
                }
            }
          
        }
        return Integer.MIN_VALUE;
    }
}
