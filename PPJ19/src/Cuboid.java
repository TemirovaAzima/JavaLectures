public class Cuboid extends Rectangle{
     private double length;

     public Cuboid(double width,double height,double length){
         super(width,height);
         this.length = length;
     }

     double w = getWidth();
     double h = getHeight();
     public void surfaceArea(){
         System.out.println("Surface area of a cuboid: " + 2*(w*h + h*length + w*length));
     }

     public void volume(){
         System.out.println("Volume of a cuboid: "+ w*h*length);
     }
}
