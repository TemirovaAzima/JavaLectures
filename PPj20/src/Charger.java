public class Charger extends Device{

    @Override
    public boolean turnOn(){
        if(getAvailablePower() >=10){
           substractAvailablePower(10);
            System.out.println("charging");
        }else{
            setAvailablePower(-1);
            System.out.println("Forced charging");
        }
        return true;
    }

}
