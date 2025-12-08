
public class Point {
    private int x,y;

    public Point(int x, int yy){
        System.out.println("Point(int,int ) with " +
                x + " and " + y);
        this.x = x;
        y = yy;
    }

    public Point(int x){
        this(x,0);
        System.out.println("Point(int) with " + x);
    }

    public Point(){
        this(0);
        System.out.println("Point()");
    }

    public Point translate(int dx, int dy){
        x+= dx;
        y+=dy;
        return this;
    }
    public Point scale(int sx,int sy){
        x*= sx;
        y*=sy;
        return this;
    }
    public int getX(){ return x; }
    public int getY(){ return y; }


    // @Override
    public String toString(){
        return "[ " + x + " , " + y + " ]";
    }

}
