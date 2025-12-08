//public class Main {
//      public static void main(String[] args){
//          TrivPoint p = new TrivPoint();
//          p.x = 1;
//          p.y = 2;
//          p.info();
//          p.setX(3);
//          p.info();
//          System.out.println("x=" + p.getX() + "; " +
//                            "y=" + p.getY());
//          TrivPoint.infoStatic(p);
//          p.infoStatic(p); // not recommended
//          p.scale(2,3);
//          p.info();
//          p.translate(1,-3);
//          p.info();
//          TrivPoint.infoStatic(p);
//          VerySimple alice = new VerySimple(23,"Alice");
//          VerySimple bob = new VerySimple(21,"Bob");
//          alice.setAge(27);
//          System.out.println(
//                  alice.getName() + " " + alice.getAge());
//          System.out.println(
//                  bob.getName() + " " + bob.getAge());
//      }
//
//
//}
////class Thermostat{
////    private double currentTemp;
////    private double targetTemp;
////    boolean on ;
////
////    public Thermostat(double currentTemp , double targetTemp){
////        this.currentTemp = currentTemp;
////        this.targetTemp = targetTemp;
////        on = false;
////    }
////    public double getCurrentTemp(){
////        return currentTemp;
////    }
////    public double getTargetTemp(){
////        return targetTemp;
////    }
////    public void setTargetTemp(int targetTemp){
////        this.targetTemp = targetTemp;
////    }
////}

public static void main(String[] args) {
//    System.out.println("\n*** Creating point p1 (1,2) ");
//    Point p1 = new Point(1,2);
//
//    System.out.println("\n*** Creating point p2 (1)");
//    Point p2 = new Point(1);
//
//    System.out.println("\n*** Creating point p3 ()");
//    Point p3 = new Point();
//
//    p3.translate(4,4).scale(2,3).translate(-1,-5);
//
//    System.out.println("\np1: [" + p1.getX() + "," +
//                          p1.getY() + "]");
//
//    System.out.println("\np1: " + p1 + " p2: " + p2 + " p3: " + p3);

      Person mary = new Person("John", 1980);
      Person john = new Person("Mary",1985);
      System.out.println("Two people created " + mary +" and " +  john);


      Person older = mary.isOlderThan(john) ? mary : john;

      System.out.println("Older is: " + older.getName() + " (born in " + older.getYear() + ")");

      String s = "Older: " + older + " is older";
      System.out.println(s);

}