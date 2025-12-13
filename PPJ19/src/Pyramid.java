public class Pyramid extends Triangle {
    private double side;

    public Pyramid(double side){
        super(side);
        this.side = side;
    }

    public void surfaceArea(){
        System.out.println("The surface area of pyramid: " + side * side * (Math.sqrt(3) + 1));
    }
    public void volume(){
        System.out.println("The volume of pyramid: " + Math.pow(side,3) / (3 * Math.sqrt(2)));
    }
}
