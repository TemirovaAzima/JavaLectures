//import java.util.Arrays;
//
//public class Sum {
//
//    public static int[] cols2(int[][] arr) throws Exception{
//
//        for(int i = 0,j= arr.length -1; i < arr.length/2; i++,j--){
//            if(arr[i].length != arr[j].length){
//                throw new Exception("Invalid data");
//            }
//        }
//        int[] arrMin = new int[arr.length];
//        int min;
//        for(int i =0,inc =0; i <arr.length; ++i){
//            min = arr[inc++][0];
//            for(int j = 0; j < arr[i].length;j++){
//                if(arr[i][j] < min){
//                    min = arr[i][j];
//                    arrMin[i] = min;
//                }else{
//                    arrMin[i] = min;
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(arrMin));
//        return arrMin;
//    }
//}

import java.util.Arrays;

class Sum{
    public static int cols2(int[][] arr){

        // col max
//        int[] res = new int[arr[0].length];
//
//        for (int i = 0; i < arr[0].length; i++){
//            res[i]  = arr[0][i];
//            for(int j = 0; j < arr.length; j++){
//                if(arr[j][i] > res[i]){
//                    res[i] = arr[j][i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(res));
//        return res;

        // row min

//        int[] resMin = new int[arr.length];
//
//        for(int i = 0; i < arr.length; i++){
//            resMin[i] = arr[i][0];
//            for(int j= 0; j < arr[i].length ; j++ ){
//                if(arr[i][j] < resMin[i]){
//                    resMin[i] = arr[i][j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(resMin));
//        return resMin;
        // Column sums

//        int[] colSum = new int[arr[0].length] ;
//
//        for(int i =0; i < arr[0].length; i++){
//            colSum[i] = arr[0][i];
//            for(int j =1; j < arr.length; j++){
//                colSum[i] += arr[j][i];
//            }
//        }
//        System.out.println(Arrays.toString(colSum));
//        return colSum;
        // Row Average

//        int[] rowAvg = new int[arr.length];
//        for(int i = 0; i < arr.length ; i++){
//            rowAvg[i] = arr[i][0];
//            for(int j = 1; j < arr[0].length; j++){
//                rowAvg[i] += arr[i][j];
//            }
//            rowAvg[i] = rowAvg[i]/ arr[i].length;
//        }
//
//        System.out.println(Arrays.toString(rowAvg));
//        return rowAvg;

        // Smallest element index
//
//        int[] minIndex = new int[2];
//        int min = arr[0][0];
//        minIndex[0] =0;
//        minIndex[1] =0;
//
//        for(int i = 0; i < arr.length;i++){
////            minIndex[i] = i
//            for(int j = 0; j < arr[i].length; j++){
//                if(arr[i][j] < min){
//                    min = arr[i][j];
//                    minIndex[0] = i;
//                    minIndex[1] = j;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(minIndex));
//        return minIndex;
        // Main Diagonal

//        if (arr == null || arr.length == 0){
//            throw new Exception("Invalid data");
//        }
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == null || arr[i].length != arr.length){
//                throw new Exception("Invalid data");
//            }
//        }
//        int[] mainDiagElem = new int[arr.length];
//
//        for(int i = 0 ; i < arr.length; i++){
//            mainDiagElem[i] = arr[i][i];
//        }
//        System.out.println(Arrays.toString(mainDiagElem));
//        return  mainDiagElem;
//        int l = arr.length-1;
//        for(int i =0 ; i < arr.length; i++){
//            mainDiagElem[i] = arr[i][arr.length-1-i];
//        }
//        System.out.println(Arrays.toString(mainDiagElem));
//        return mainDiagElem;

//        int[] countPosNum = new int[arr[0].length];
//
//        int count ;
//        for(int i = 0; i < arr[0].length; i++){
//            count =0;
//            for(int j = 0; j < arr.length; j++){
//                if(arr[j][i] > 0){
//                    countPosNum[i] = ++count;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(countPosNum));
//        return countPosNum;

//        // Column Difference
//        int[] colDiff = new int[arr[0].length];
//        for(int i = 0 ; i < arr[0].length; i++){
//            int max = arr[0][i];
//            int min = arr[0][i];
//            for(int j = 0; j < arr.length; j++){
//                if(arr[j][i] < min){
//                    min = arr[j][i];
//                }
//                if(arr[j][i] > max)
//                    max = arr[j][i];
//                }
//            colDiff[i] = max-min;
//        }
//        System.out.println(Arrays.toString(colDiff));
//        return colDiff;


        int maxDiaNum =0 ;
        int max1 = arr[0][0];
        int max2 = arr[0][arr.length-1];
        for(int i =0; i < arr.length;i++){

            if(arr[i][i] > max1){
                max1= arr[i][i];
            }
            if(arr[i][arr.length-1-i] >max2){
                max2 = arr[i][arr.length-1-i];
            }
        }
        maxDiaNum = max1> max2? max1 : max2;
        System.out.println(maxDiaNum);
        return maxDiaNum;

    }

}
