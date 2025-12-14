public class Heater extends Device{


    @Override
    public boolean turnOn(){
        if(getAvailablePower() >= 2000){
            substractAvailablePower(2000);
            System.out.println("Heating");
            return true;
        }
            System.out.println("Fuses blown");
            setAvailablePower(0);
            return false;
    }
}
