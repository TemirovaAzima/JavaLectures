import java.util.Arrays;

public class MaxCol {

    public static double[] maxCol(int[][] arr){

        double[] maxC = new double[arr[0].length];
        for(int i = 0; i < arr[0].length; i++){
            maxC[i] = arr[0][i];
            for(int j = 0; j < arr.length; j++){
                if(arr[j][i] > maxC[i]){
                    maxC[i] = arr[j][i];
                }
            }
        }
        System.out.println(Arrays.toString(maxC));
        return maxC;
    }

}
