public class Chaining {
    private int x;
    private int y;

    public Chaining(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Chaining adding(int x, int y){
        this.x+= x;
        this.y+= y;
        return this;
    }
    @Override
    public String toString(){
        return "x " + x + " , y " + y;
    }
}
