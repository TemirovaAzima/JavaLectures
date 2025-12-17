public class Main {
    public static void main(){
        Car car = new Car("tesla","white");
        car.increasePower();
        System.out.println(car);
        SportCar sportCar = new SportCar("hhkj","yellow",2000);
        sportCar.increasePower();
        System.out.println(sportCar);

//        int[][] arr = {{1,2,3},{4,5,6}};
//        System.out.println(arr[2][0]);

        int[][] arr1 = {{8,0,0,0}, {0,1,5,3},{6,7,8,4}};
        int x = 0;
        for(int i = 0; i < arr1.length; i++)
            for(int j = 0; j <i ; j++ )
                if(x < arr1[i][j]) x = arr1[i][j];
        System.out.println(x - arr1[arr1.length -1].length);

        int[][] arr = {{0,2,1,2},{3,8,5,3},{6,7,4,4}};
        int x1 =0 ;
        for(int i = 0; i < arr.length; i++)
            for (int j = i; j< arr[i].length;j++)
                if(x1 < arr[i][j]) x1 = arr[i][j];
        System.out.println(x1 + arr[arr.length-1].length);

        int res = arr[0][arr[0].length -1] + arr[arr.length -1][0];
//        int res1 = arr[0][arr.length-1] + arr[arr[0].length-1][0]; // wrong
//        int res2 = arr[0][arr[0].length] + arr[arr[0].length][0];
        System.out.println(res);

        int[][] a = {{1,2,3},{4,5},{6,7},{8,9}};
        int res2 = a.length + a[1].length + a[0][2];
        System.out.println(res2);
        //
        int [] a2 = {3,3}, b = a2;
        a2[0] = 1;
        b[1] = 2;
        System.out.println(a2[0] + " " + a2[1] + " " + b[0] + " " + b[1] );

    }
}
