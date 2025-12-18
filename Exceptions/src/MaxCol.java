import java.util.Arrays;

public class MaxCol {

//    public static double[] maxCol(int[][] arr){
//
//        double[] maxC = new double[arr[0].length];
//        for(int i = 0; i < arr[0].length; i++){
//            maxC[i] = arr[0][i];
//            for(int j = 0; j < arr.length; j++){
//                if(arr[j][i] > maxC[i]){
//                    maxC[i] = arr[j][i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(maxC));
//        return maxC;
//    }
//    public static int[][] transpose(int[][] arrin){
//        int[][] transp = new int[arrin[0].length][];
//        for(int i = 0; i < arrin[0].length;i++){
//            transp[i] = new int[arrin.length];
//
//            for(int j = 0; j < arrin.length; j++){
//                transp[i][j] = arrin[j][i];
//            }
//        }
//        for(int[] n : transp){
//            System.out.println(Arrays.toString(n));
//        }
//        return transp;
//    }

    public static int[] cols2(int[][] arr){

        int[] col = new int[arr[0].length];
        for(int i = 0; i <arr[0].length; i++){
            col[i] = arr[0][i];
            for(int j =0; j < arr.length; j++){
                if(arr[j][i] < col[i]){
                    col[i] = arr[j][i];
                }
            }
        }
        System.out.println(Arrays.toString(col));
        return col;
    }


}
