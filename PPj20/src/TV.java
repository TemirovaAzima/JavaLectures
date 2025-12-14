public class TV extends Device {

    @Override
    public boolean turnOn(){
        if(getAvailablePower() >= 100){
            substractAvailablePower(100);
            System.out.println("Playing in the channel one");
            return true;
        }
        System.out.println("Waiting for resources");
        return false;
    }
}
