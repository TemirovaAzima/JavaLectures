
public class SimpleRecur {
    // should be called with from=0
    static void printArrRec(int[] arr, int from) {
        if (from == arr.length)
            return;
        System.out.println(arr[from]);

        // first print then invoke next
        // System.out.print(arr[from] + " ");
        printArrRec(arr, from + 1);
    }

    // should be called with from=0
    static void printArrRecReverse(int[] arr, int from) {
        if (from == arr.length)
            return;

        // first invoke next then print
        printArrRecReverse(arr, from + 1);
        System.out.print(arr[from] + " ");

        if (from == 0) System.out.println();
    }

    // should be called with from=0, to=arr.length
    static void revArrayRec(int[] arr, int from, int to) {
        if (to - from <= 1)
            return;
        int temp = arr[from];
        arr[from] = arr[to - 1];
        arr[to - 1] = temp;
        revArrayRec(arr, from + 1, to - 1);
    }

    // should be called with from=0
    static int maxElemRec(int[] arr, int from) {
        if (from == arr.length - 1)
            return arr[from];
        return Math.max(arr[from], maxElemRec(arr, from + 1));
    }

    // should be called with from=0
    static void selSortRec(int[] arr, int from) {
        if (from == arr.length - 1)
            return;
        int indmin = from;
        for (int i = from + 1; i < arr.length; i++) {
            if (arr[i] < arr[indmin])
                indmin = i;
        }
        int temp = arr[from];
        arr[from] = arr[indmin];
        arr[indmin] = temp;
        selSortRec(arr, from + 1);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int fact(int n) {
        return n <= 1 ? 1 : n * fact(n - 1);
    }

    // must be called with k=2
    static boolean isPrime(int n, int k) {
        if (k * k > n)
            return true;
        if (n % k == 0)
            return false;
        return isPrime(n, k + 1);
    }

    static long counter = 0;
    // very slow way of calculating fibonacci numbers
    static long fibo(int n) {
        counter++;
        return n < 2 ? (long)n : fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 5, 7, 9, 11};
        printArrRec(arr, 0);
        printArrRecReverse(arr, 0);
        revArrayRec(arr, 0, arr.length);
        printArrRec(arr, 0);
        printArrRecReverse(arr, 0);
        selSortRec(arr, 0);
        printArrRec(arr, 0);
        System.out.println("Max. in a: " + maxElemRec(arr, 0));

        // GCD
        System.out.println("Greatest common divider of " +
                "5593 and 11067 is " + gcd(5593, 11067));

        // FACTORIALS
        System.out.println("!10 = " + fact(10));
        System.out.println("!12 = " + fact(12));
        // NO ERROR BUT WRONG!!!
        System.out.println("!13 = " + fact(13) + " WRONG!");

        // PRIMES
        System.out.println("\nPrimes up to 100:");
        for (int n = 2; n <= 100; n++) {
            if (isPrime(n, 2))
                System.out.print(n + " ");
        }
        System.out.println();
    }
}
