public class StatExample {
    private static double rate = 1;
    private static char ID = 'A';

    private double amount;
    private char id ;

    public static void setRate(double r) {rate = r;}
    public static double getRate() {return rate; }
    public static char getID() {return ID; }

    StatExample(double a){
        id = ID++;
        amount = a;
    }

    @Override
    public String toString(){
        return "I'm " + id + ", I have $" + amount +
                " = " + rate*amount  + " PLN " + ID;
    }

}