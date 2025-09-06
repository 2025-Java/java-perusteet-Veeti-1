package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        // TODO
            double average = 0.0;
            double summa = 0.0;
            if(arr.length != 0){
                int maara = arr.length;
                for(int i : arr){
                    summa+=i;
                }
                average = summa/maara;
                return average;
            }
        
        return 0.0;
        
    }
    public static int max(int[] arr) {
        // TODO
        int maximi = arr[0];
        if(arr.length !=0){
            for(int i = 0; i<arr.length; i++){
                if(arr[i]>maximi){
                    maximi = arr[i];
                    return maximi;
                }
            }
          
        }
        return Integer.MIN_VALUE;
    }
}
