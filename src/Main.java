public static void main(String[] args) {
    // fibonacci
    for(int n = 40 ; n <=46; n+=2){
        SimpleRecur.counter = 0;
        long r = SimpleRecur.fibon(n);
        System.out.println("Fibo(" + n + " )= " + r +
                         "; counter = " + SimpleRecur.counter);
    }

    // Primes
    System.out.println("Primes up to 100");
    for(int i = 2; i <= 100 ; i++){
        if(SimpleRecur.isPrimes(i,2)){
            System.out.print(i + " ");
        }
    }
    // factorials
    System.out.println(SimpleRecur.factorial(5));
    // NO ERROR BUT WRONG!!!
    System.out.println(SimpleRecur.factorial(13));
    // GCD

    System.out.println(SimpleRecur.gcd(50,140));
    int[] arr = {13,3,55,7,9,11};
    SimpleRecur.printArrRec(arr,0);
    SimpleRecur.printArrRecReverse(arr,0);
    // find max
    System.out.println(SimpleRecur.findMax(arr,0));
    SimpleRecur.selSorRec(arr,0);


}