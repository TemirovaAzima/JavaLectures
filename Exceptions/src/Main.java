import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//public class Main {
//        public static void main(){
//            char[] arr = new char[10];
//            for(int i = 0; i < arr.length ; i++){
//                arr[i] = (char)('A' + (int)(Math.random()*26));
//            }
//            for(char c: arr){
//                System.out.print(c + " ");
//            }
//            System.out.println();
//            //
//
//            int[] a0 = new int[]{1,2,3};
//            int[] a1 = {4,5,6};
//            int[] arrsum = new int[a0.length];
//            for(int i= 0; i < arrsum.length; i++){
//                arrsum[i] = a0[i] + a1[i];
//            }
//            for(int n : arrsum){
//                System.out.print(n + " ");
//            }
//            // find max
//            int[] arr2 = {1,-6,9,-2,7};
//            int mx = arr2[0];
//            for(int i = 0; i < arr2.length ; i++)
//                if(arr2[i] > mx) mx = arr2[i];
//            System.out.println("Maximum element is: " + mx);
//
//            int[] arr3 = {1,-6,9,-2,7};
//            int indmax = 0;
//            for(int i =0 ; i < arr3.length; i++)
//                if(arr2[i] > arr3[indmax]) indmax = i;
//            System.out.println("Maximum elemnent has index " + indmax);
//
//
//            // swapping elements
//            for(int i =0 , j = arr3.length-1; i <(arr3.length-1)/2 ; i++, j--){
//                int tmp = arr3[i];
//                arr3[i] = arr3[j];
//                arr3[j] = tmp;
//            }
//            for(int n : arr3){
//                System.out.print(n + " ");
//            }
//            System.out.println();
//
//            // 2
//            int[] arr5 = {1,2,3,4,5,6};
//            // shuffling
//            for(int i = 0; i < arr5.length-1; i++){
//                // random index from interval [i,arr.length - 1]
//                int r =  (int)((arr5.length-1)*Math.random());
//                // swapping
//                int tmp = arr5[i];
//                arr5[i] = arr5[r];
//                arr5[r] = tmp;
//            }
//            for(int n : arr5){
//                System.out.print(n + " ");
//            }
//
//        }
//}
public class Main {
    public static void main(String[] args) {
//        // ==========================================
//        int[] a = {1, 2, 3};
//        System.out.println("a.length = " + a.length);
//
//        for (int i = 0; i < a.length; ++i)
//            a[i] = (i + 1) * (i + 1);
//        for (int i = 0; i < a.length; ++i)
//            System.out.print(a[i] + " ");
//        System.out.println('\n');
//
//        // ==========================================
//        int[][] b = {{1, 2, 3}, {4, 5, 6, 7, 8}, {11, 12}};
//        System.out.println("b.length = " + b.length);
//        for (int row = 0; row < b.length; ++row)
//            System.out.println("b[" + row + "].length = " + b[row].length);
//        System.out.println();
//
//        for (int row = 0; row < b.length; ++row) {
//            for (int col = 0; col < b[row].length; ++col)
//                System.out.print(b[row][col] + " ");
//            System.out.println();
//        }
//        System.out.println('\n');
////
////        // ==========================================
//        int[] c = new int[]{1, 2, 3}; // size inferred
//        System.out.println("c.length = " + c.length);
//        for (int i = 0; i < c.length; ++i)
//            System.out.print(c[i] + " ");
//        System.out.println('\n');
////
////        // ==========================================
//        int[] d = new int[5]; // elements are 0
//        System.out.println("d.length = " + d.length);
//        for (int i = 0; i < d.length; ++i)
//            System.out.print(d[i] + " ");
//        System.out.println('\n');
////
////        // ==========================================
//        int[][] e = new int[3][2]; // a 3x2 matrix
//        System.out.println("e.length = " + e.length);
//        for (int row = 0; row < e.length; ++row)
//            for (int col = 0; col < e[row].length; ++col)
//                e[row][col] = row + col;
//
//        for (int i = 0; i < e.length; i++) {
//            for (int j = 0; j < e[i].length; j++) {
//                System.out.print(e[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // Code for printing 'e' and initializing 'f' follows in Listing 28 logic
//        // ==========================================
//        int[][] f = new int[3][];
//        for (int row = 0; row < f.length; ++row)
//            System.out.print(f[row] + " ");
//        System.out.println();
//
//        for (int row = 0; row < f.length; ++row)
//            f[row] = new int[row * row + 2];
//
//        for (int row = 0; row < f.length; ++row) {
//            System.out.println("f[" + row + "].length = " + f[row].length);
//            for (int col = 0; col < f[row].length; ++col)
//                f[row][col] = row + col;
//        }
//        System.out.println();
//        for (int i = 0; i < f.length; i++) {
//            for (int j = 0; j < f[i].length; j++) {
//                System.out.print(f[i][j] + " ");
//            }
//            System.out.println();
//        }
////
////        for (int row = 0; row < f.length; ++row) {
////            for (int col = 0; col < f[row].length; ++col)
////                System.out.print(f[row][col] + " ");
////            System.out.println();
////        }
//
//        // 'Inserting' a value at a given index
//        int[] t = {4, 5, -2, 4, 1, 6, 7};
//        int ind = 3;
//        int value = 9;
//        System.out.println("Inserting a value " + value + " at index " + ind);
//        System.out.println(Arrays.toString(t));
//
//        for (int i = t.length - 1; i > ind; --i) // must be backward
//            t[i] = t[i - 1];
//
//        t[ind] = value;
//        System.out.println(Arrays.toString(t));
//
//        // 'Expanding' an array by inserting
//        // a value at a given index
//        int[] p = {4, 5, -2, 4, 1, 6, 7};
//        int index = 3;
//        int val = 9;
//
//        System.out.println("Expanding an array by inserting " +
//                val + " at index " + index);
//
//        System.out.println(Arrays.toString(p));
//        int[] k = new int[p.length + 1]; // longer array
//
//        for (int i = 0; i < index; ++i)
//            k[i] = p[i];
//        System.out.println(Arrays.toString(k));
//
//        for (int i = index + 1; i < k.length; ++i)
//            k[i] = p[i - 1];
//
//        System.out.println(Arrays.toString(k));
//        k[ind] = val;
//        System.out.println(Arrays.toString(k));
//
//        // 'Removing' the element with a given index
//        int[] a2 = {1, 2, 4, 7, 4, 2, 8};
//        int ind2 = 3;
//
//        System.out.println("'Removing' element with index " + ind2);
//        System.out.println(Arrays.toString(a2));
//
//        for (int i = ind2; i < a2.length - 1; ++i)
//            a2[i] = a2[i + 1];
//
//        System.out.println(Arrays.toString(a2));
//
//
//        // 'Removing' the element with a given
//        // index and 'shrinking' the array
//        int[] a3 = {1, 2, 4, 7, 4, 2, 8};
//        int ind3 = 3;
//
//        System.out.println("'Removing' element with index " +
//                ind3 + " and 'shrinking' the array");
//        System.out.println(Arrays.toString(a3));
//
//        int[] b3 = new int[a3.length - 1]; // Create a shorter array
//        System.out.println(Arrays.toString(b3));
//
//        // Copy elements before the index
//        for (int i = 0; i < ind3; ++i)
//            b3[i] = a3[i];
//        System.out.println(Arrays.toString(b3));
//
//
//        // Copy elements after the index
//        for (int i = ind; i < b3.length; ++i)
//            b3[i] = a3[i + 1];
//
//        System.out.println(Arrays.toString(b3));
//
//        // 'Splitting' an array into two arrays
//        // and/or one two-dimensional array
//        System.out.println("'Splitting' an array into two");
//        int[] u = {4, 5, -2, 0, 4, -1, 6, 0, -7, 9}; // 'a' changed to 'u'
//        int numNeg = 0;
//        int numPos = 0;
//
//        // First pass: count how many positive and negative numbers there are
//        for (int i = 0; i < u.length; ++i) {
//            if (u[i] < 0) ++numNeg;
//            else if (u[i] > 0) ++numPos;
//        }
//
//        // Initialize arrays with the correct sizes
//        int[] uneg = new int[numNeg]; // 'aneg' changed to 'uneg'
//        int[] upos = new int[numPos]; // 'apos' changed to 'upos'
//
//        // Second pass: fill the new arrays
//        for (int i = 0, ineg = 0, ipos = 0; i < u.length; ++i) {
//            if (u[i] < 0) uneg[ineg++] = u[i];
//            else if (u[i] > 0) upos[ipos++] = u[i];
//        }
//
//        System.out.println(Arrays.toString(u));
//        System.out.println(Arrays.toString(uneg));
//        System.out.println(Arrays.toString(upos));
//
//        // Array of arrays (two-dimensional array)
//        int[][] uu = {uneg, upos}; // 'aa' changed to 'uu'
//
//        System.out.println("\nBefore swapping");
//        System.out.println(Arrays.toString(uu[0]));
//        System.out.println(Arrays.toString(uu[1]));
//
//        // Swapping rows using a temporary variable
//        int[] tmp = uu[0];
//        uu[0] = uu[1];
//        uu[1] = tmp;
//
//        System.out.println("\nAfter swapping");
//        System.out.println(Arrays.toString(uu[0]));
//        System.out.println(Arrays.toString(uu[1]));
//
//
//        // array returned from a function
//        int[] m = getArr(5);
//        printArr(m, "Array returned from function");
//
//        // passing reference to function
//        reverseArr(m);
//        printArr(m, "Array m reversed");
//    }
//
//    /**
//     * prints an array of integer numbers
//     */
//    private static void printArr(int[] m, String message) {
//        System.out.print(message + ":\n [");
//        for (int i : m) System.out.print(" " + i);
//        System.out.println(" ]; size = " + m.length);
//    }
//
//    /**
//     * returns first n triangular numbers
//     */
//    private static int[] getArr(int n) {
//        int[] arr = new int[n];
//        for (int i = 0; i < n; ++i)
//            arr[i] = (i + 1) * (i + 2) / 2;
//        return arr;
//    }
//
//    /**
//     * modifies input array (reversing order of elements)
//     */
//
//    private static void reverseArr(int[] m) {
//        for (int i = 0, j = m.length - 1; i < j; ++i, --j) {
//            int p = m[i];
//            m[i] = m[j];
//            m[j] = p;
//        }
//
//    }
//    int c = 2;
////    primesBetween(c, 20);
//         static boolean isPrime(int n) {
//            n = n >= 0 ? n : -n;
//            if (n <= 1) throw new IllegalArgumentException();
//            if (n <= 3) return true;
//            if (n % 2 == 0) return false;
//            boolean res = true;
//            for (int p = 3; p * p <= n && res; p += 2)
//                if (n % p == 0) res = false;
//            return res;
//        }
//
//        static void primesBetween(int a, int b) {
//            for (int num = a; num <= b; ++num) {
//                boolean prime = isPrime(num);
//                System.out.println(num + " is " +
//                        (prime ? "" : "NOT ") + "prime");
//            }


//        PascalTriangle.pascalTri(9);
//            int[][] arr8 = {{-99,2,3,-9},
//                            {7,-1,4,-10},
//                            {-109,0,89,9},
//                             {9,0,2,-8}};
//            try{
//                Sum.cols2(arr8);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        int[] arr = new int[]{1,3,4,5};
//        PascalTriangle.swap(arr,1,3);
//
//        System.out.println(PascalTriangle.area(5));
//        System.out.println(PascalTriangle.area(4,5));
//        System.out.println(PascalTriangle.area(4,5,7));
        // task from previous test

//        int[] arr = new int[100];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 150 - 50);
//        }
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//
//
//        if (sum % 2 != 0) {
//            int[] arr2 = new int[arr.length];
//            for (int i = 0; i < arr.length; i++) {
//                arr2[i] = arr[i];
//            }
//            System.out.println(Arrays.toString(arr2));
//        }

//        int[] arr = new int[100];
//
//        for(int i = 0; i < arr.length ; i++){
//            arr[i] = (int)(Math.random()*81) - 40;
//        }
//        int counter = 0;
//        for(int i = 0; i < arr.length;i++){
//            if(arr[i] % 2 !=0){
//                counter++;
//            }
//        }
//
//        int[] arr2 = new int[counter];
//        int index =0;
//        for(int i = 0 ; i <arr.length; i++){
//            if(arr[i] % 2 !=0){
//                arr2[index] = arr[i];
//                index++;
//            }
//        }
//        for(int i = 0 ; i < arr2.length ; i++){
//            for(int j = i+1 ; j < arr2.length ; j++){
//                if(arr2[i] > arr2[j]){
//                    int tmp = arr2[i];
//                    arr2[i] = arr2[j];
//                    arr2[j] = tmp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr2));
//        for(int i = arr2.length -1 ; i >= 0; i--){
//            System.out.print(arr2[i] + " ");
//        }
//
//        int[] arr = new int[50];
//
//        for(int i = 0 ; i <arr.length ; i++){
//            arr[i] = (int)(Math.random() * 151) -100;
//        }
//
//        System.out.println(Arrays.toString(arr));
//        int posOddCounter =0;
//        int negEvenCounter =0;
//        for(int i = 0; i < arr.length;i++){
//            if(arr[i] % 2 !=0 && arr[i] >0){
//                posOddCounter++;
//            }
//            if(arr[i] % 2 ==0 && arr[i] <0){
//                negEvenCounter++;
//            }
//        }
//        int[] posOdd = new int[posOddCounter];
//        int[] negEven = new int[negEvenCounter];
//
//        int index =0;
//        int index2 =0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 2 != 0 && arr[i] > 0){
//                posOdd[index++] = arr[i];
//            }
//             if(arr[i] % 2 ==0  && arr[i] <0){
//                 negEven[index2++] = arr[i];
//             }
//        }
//        System.out.println(Arrays.toString(posOdd));
//        System.out.println(Arrays.toString(negEven));

        int[] arr = new int[100];

        for(int i =0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*151) -50;
        }

        int sum = 0;
        int counter=0;
        for(int i = 0; i <arr.length; i++){
            sum =0;
            int tmp = Math.abs(arr[i]);
            while(tmp >0){
                sum += tmp%10;
                tmp = tmp/10;
            }
            if(sum %2!=0){
                counter++;
            }
        }

        System.out.println(counter);
        System.out.println(Arrays.toString(arr));
        int[] arrOdd = new int[counter];

        int index =0;
        for(int i = 0; i <arr.length; i++){
            sum=0;
            int tmp = Math.abs(arr[i]);
            while(tmp >0){
                sum += tmp%10;
                tmp = tmp/10;

            }
            if(sum %2!=0){
                arrOdd[index++] = arr[i];
            }

        }

        System.out.println(Arrays.toString(arrOdd));

}}
