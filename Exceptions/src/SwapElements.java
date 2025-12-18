import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapElements {

    public static void swElems(int[] arr){

//        for(int i = arr.length/2; i <arr.length/2; i++){
//            int tmp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1 -i] = tmp;
//
//        }
        for(int i = arr.length/2,j = arr.length-1; i<j; i++,j--){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
