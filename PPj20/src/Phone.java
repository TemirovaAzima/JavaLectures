public class Phone {
    private String communicationInterface;
    private String color;

    public Phone(String communicationInterface,String color){
        this.communicationInterface = communicationInterface;
        this.color = color;
    }
    private String number ;
    public String getNumber(){
        return number;
    }
    public void call(String number){
        this.number = number;
        System.out.println(number);
    }

    public void displayCallHistory(){
        System.out.println("No history");
    }

}
