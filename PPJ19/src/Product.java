public class Product {
    private String name;
    private double netPrice;
    private static double vatRate = 23;

    public Product(String name, double netPrice){
        this.name = name;
        this.netPrice = netPrice;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public static void changeVatRate(double newVatRate){
        vatRate = newVatRate;
    }
    public double getGrossPrice(){
        return netPrice * (1 + vatRate/100);
    }
    public double getVatRate(){
        return vatRate;
    }
}
