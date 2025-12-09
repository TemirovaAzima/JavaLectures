import java.util.Arrays;

public class SimpleRecur {
    // Fibonacci numbers
    public static long counter = 0;
    public static int fibon(int n){
        counter++;
        return n<=1? n : fibon(n-1) + fibon(n-2);
    }
    // Primes
    public static boolean isPrimes(int n, int k){
        if(k * k > n) return true;
        if(n % k == 0) return false;
        return isPrimes(n,k+1);
    }
    // Factorials
    public static int factorial(int n){
        if(n <=1) return n;
        return n * factorial(n-1);
    }
    // GCD
    public static int gcd(int a ,int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    //
    static void printArrRec(int[] arr ,int from) {

        if(arr.length== from){
            System.out.println();
            return;
        }
        System.out.println(arr[from] + " ");
        printArrRec(arr,from+1);
    }

    static void printArrRecReverse(int[] arr, int from){
        if(arr.length == from){
            return;
        }
        printArrRecReverse(arr,from+1);
        System.out.print(arr[from] + " ");
        if(from == 0) System.out.println();
    }

    static int findMax(int [] arr, int from){
        if(from == arr.length) return arr[from-1];

        int res = findMax(arr,from+1);
        return arr[from] > res ? arr[from] : res;
//        return Math.max(arr[from], findMax(arr,from+1));
    }
    //
    static void selSorRec(int[] arr,int from){
        if(arr.length == from){
            return ;
        }
        int indmin  = from;
        for(int i = from+1 ; i < arr.length ; i++){
            if(arr[i] < arr[indmin]){
                indmin = i;
            }
        }
         int temp = arr[from];
         arr[from] = arr[indmin];
         arr[indmin] = temp;
         selSorRec(arr, from+1);
        System.out.println(Arrays.toString(arr));
    }


}
