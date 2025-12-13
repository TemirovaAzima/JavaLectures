public class Rectangle {
     private double height ;
     private double width ;

     public Rectangle(double width,double height){
         this.height = height;
         this.width = width;
     }
     public void area(){
         System.out.println("Area: " + height * width);
     }

     public double getHeight(){
         return height;
     }
     public double getWidth(){
         return width;
     }

}
