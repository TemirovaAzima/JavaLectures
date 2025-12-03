public class Main {
      public static void main(String[] args){
          TrivPoint p = new TrivPoint();
          p.x = 1;
          p.y = 2;
          p.info();
          p.setX(3);
          p.info();
          System.out.println("x=" + p.getX() + "; " +
                            "y=" + p.getY());
          TrivPoint.infoStatic(p);
          p.infoStatic(p); // not recommended
          p.scale(2,3);
          p.info();
          p.translate(1,-3);
          p.info();
          TrivPoint.infoStatic(p);
      }


}
//class Thermostat{
//    private double currentTemp;
//    private double targetTemp;
//    boolean on ;
//
//    public Thermostat(double currentTemp , double targetTemp){
//        this.currentTemp = currentTemp;
//        this.targetTemp = targetTemp;
//        on = false;
//    }
//    public double getCurrentTemp(){
//        return currentTemp;
//    }
//    public double getTargetTemp(){
//        return targetTemp;
//    }
//    public void setTargetTemp(int targetTemp){
//        this.targetTemp = targetTemp;
//    }
//}