public class Triangle {
    private double side;

    public Triangle(double side){
        this.side = side;
    }

    public double area(){
        return Math.sqrt(3)/4* side*side ;
    }

    public double getSide(){
        return side;
    }
}
