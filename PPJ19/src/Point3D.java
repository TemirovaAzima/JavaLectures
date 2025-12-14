public class Point3D extends Point2D{
    private double z;

    public Point3D(double x, double y , double z){
        super(x,y);
        this.z = z;
    }

//
//
//    public double distance(Point3D other){
//         double x = other.getX() - super.getX();
//         double y = other.getY() - super.getY();
//         double z1 = other.getZ() - this.z;
//         return Math.sqrt(x*x + y*y + z1*z1);
//    }

//    @Override
//    public double distance(Point2D other){
//        double x = other.getX() - super.getX();
//        double y = other.getY() - super.getY();
//        double z1 = 0 - this.z ;
//        return Math.sqrt(x*x + y*y + z1*z1);
//    }

    public double getZ(){
        return z;
    }

    @Override
    public double distance(Point2D other){
        double base = super.distance(other);
        return Math.sqrt(base*base + z*z);
    }


    public double distance(Point3D other){
        //Polymorphism: Point3D is Point2D, so it accepts
        double base = super.distance(other);
        double dz = other.z - z;

        return Math.sqrt(base*base + dz*dz);
    }

}
