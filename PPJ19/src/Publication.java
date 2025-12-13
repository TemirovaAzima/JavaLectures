public class Publication {
    private String title;
    private double price;
    private static int publicationCounter;

    public Publication(String title,double price){
        this.title = title;
        this.price = price;
        publicationCounter++;
    }

    public static int currentNumPublication(){
        return publicationCounter;
    }

    @Override
    public String toString(){
        return  "\"" + title + "\"" + ", price: " + price + "$";
    }
}
