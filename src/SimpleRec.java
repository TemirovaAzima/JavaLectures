public class SimpleRec {
    // should be called with from=0
    static void printArrRec(int[] arr, int from) {
        if (from == arr.length)
            return;
        System.out.println(arr[from]);

        // first print then invoke next
        // System.out.print(arr[from] + " ");
        printArrRec(arr, from + 1);
        System.out.println("azima you are cool" + from);
    }

    //    // should be called with from=0
    static void printArrRecReverse(int[] arr, int from) {
        if (from == arr.length)
            return;

        // first invoke next then print
        System.out.println("heh");
        printArrRecReverse(arr, from + 1);
        System.out.print(arr[from] + " ");

        if (from == 0) System.out.println("lol");
    }

    // should be called with from=0, to=arr.length
    static void revArrayRec(int[] arr, int from, int to) {
        if (to - from <= 1)
            return;
        int temp = arr[from];
        arr[from] = arr[to - 1];
        arr[to - 1] = temp;
        System.out.println("new York");
        System.out.println(arr[from] + " from ");
        System.out.println(arr[to - 1] + " to ");
        revArrayRec(arr, from + 1, to - 1);
        System.out.println("New york 2");
    }

    //    // should be called with from=0
    static int maxElemRec(int[] arr, int from) {
        if (from == arr.length - 1)
            return arr[from];
        System.out.println("hehe ☆*: .｡. o(≧▽≦)o .｡.:*☆");
        return Math.max(arr[from], maxElemRec(arr, from + 1));
    }

    //
//    // should be called with from=0
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
        System.out.println("blabla");
        selSortRec(arr, from + 1);
        System.out.println("mama");
    }

    //
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //
    static int fact(int n) {
        return n <= 1 ? 1 : n * fact(n - 1);
    }

    //
//    // must be called with k=2
    static boolean isPrime(int n, int k) {
        if (k * k > n)
            return true;
        if (n % k == 0)
            return false;
        return isPrime(n, k + 1);
    }

    //
    static long counter = 0;

    //    // very slow way of calculating fibonacci numbers
    static long fibo(int n) {
        counter++;
        return n < 2 ? (long) n : fibo(n - 1) + fibo(n - 2);
    }
}
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 5, 7, 9, 11};
        SimpleRec.printArrRec(arr, 0);
        SimpleRec.printArrRecReverse(arr, 0);
        SimpleRec.revArrayRec(arr, 0, arr.length);

//        SimpleRec.printArrRec(arr, 0);
//        SimpleRec.printArrRecReverse(arr, 0);
        SimpleRec.selSortRec(arr, 0);
//        printArrRec(arr, 0);
        System.out.println("Max. in a: " + SimpleRec.maxElemRec(arr, 0));
//
//        // GCD
//        System.out.println("Greatest common divider of " +
//                "5593 and 11067 is " + SimpleRec.gcd(5593, 11067));
        System.out.println("Greatest common divider of " +
                "5593 and 11067 is " + SimpleRec.gcd(50, 140));
//
//        // FACTORIALS
        System.out.println("!10 = " + SimpleRec.fact(10));
        System.out.println("!12 = " + SimpleRec.fact(12));
//        // NO ERROR BUT WRONG!!!
        System.out.println("!14 = " + SimpleRec.fact(13) + " WRONG!");
//
//        // PRIMES
        System.out.println("\nPrimes up to 100:");
        for (int n = 2; n <= 100; n++) {
            if (SimpleRec.isPrime(n, 2))
                System.out.print(n + " ");
        }
        System.out.println();
        // Fibonacci numbers
        for (int n = 40; n <= 46; n += 2) {
            SimpleRec.counter = 0;
            long r = SimpleRec.fibo(n);
            System.out.println("Fibo(" + n + ") = " + r + "; counter = " + SimpleRec.counter);
        }
    }
