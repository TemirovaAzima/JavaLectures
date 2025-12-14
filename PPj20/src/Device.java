public class Device {
    private static int availablePower = 5000;

    public static void resetFuses(){
        availablePower = 5000;
    }

    public boolean turnOn(){
        return false;
    }
    public static int getAvailablePower(){
        return availablePower;
    }
    public static void setAvailablePower(int availablePower){
        Device.availablePower = availablePower;
    }
    public static void substractAvailablePower(int power){
        availablePower -= power;
    }
}
