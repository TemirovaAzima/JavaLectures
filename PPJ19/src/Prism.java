public class Prism extends Triangle {
   private double height;
   private double side;
    public Prism(double side,double height){
        super(side);
        this.height = height;
        this.side = side;
    }

    public double surfaceArea(){
        return side* 3* height + super.area()*2;
    }
    public double volume(){
        return super.area() * height;
    }



}
