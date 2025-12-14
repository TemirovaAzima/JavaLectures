public class TractorUnit extends WheeledVehicle {
    private double weight;

    public TractorUnit(String color, int numberOfAxes,double weight){
        super(color,numberOfAxes);
        this.weight = weight;
    }

    public void startDriving(){
        if(weight/getNumberOfAxes() > 11 ){
            System.out.println("Dangerous driving, engine start refused");
        }
    }
}
