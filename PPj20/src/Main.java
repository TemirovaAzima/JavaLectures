public class Main {
    public static void main(String[] args){
        // 1
        TractorUnit tractor = new TractorUnit("green",4,45);
        tractor.startDriving();
        // 2
        Device heater= new Heater();
        Device tv = new TV();
        Device charger = new Charger();
        Device device = new Device();
        System.out.println(device.turnOn());
        heater.turnOn();
        heater.turnOn();
        heater.turnOn();
        tv.turnOn();
        charger.turnOn();

    }
}
