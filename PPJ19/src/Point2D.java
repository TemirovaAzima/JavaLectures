public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }
//
//    @Override
    public double distance(Point2D other){
        double x1 = other.getX() - x;
        double y1 = other.getY() - y;
        return Math.sqrt(x1*x1 + y1 * y1);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}
