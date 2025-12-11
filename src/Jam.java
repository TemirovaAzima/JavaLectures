public class Jam {
    private  String flavor;
    private double weight ;

    public Jam(String flavor, double weight){
        this.flavor = flavor;
        this.weight = weight;
    }

    public Jam(double weight){
        this("No name",weight);
//        this.weight = weight;
//        flavor = "No name";
    }

    public Jam(String flavor){
        this(flavor,100.0);
//        weight = 100.0;
    }
//    public void show(){
//        System.out.println("Flavor: "+ flavor + " weight: " + weight);
//    }
    @Override
    public String toString(){
        return "Flavor = " + flavor + ", weight = " + weight;
    }

}
