public class Thermostat {
    private double currentTemperature;
    private double targetTemperature;
    private boolean on;

    public Thermostat(double currentTemp, double targetTemp){
      currentTemperature = currentTemp;
      targetTemperature = targetTemp;
    }

    public double getCurrentTemperature(){
        return currentTemperature;
    }

    public double getTargetTemperature(){
        return targetTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setTargetTemperature(double tagetTemp){
        if(tagetTemp< 10){
            targetTemperature = 10;
        }else if(tagetTemp>30){
            targetTemperature = 30;
        }else{
            targetTemperature = tagetTemp;
        }
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public String status(){
        return (on) ?  "Thermostat on, current: " + currentTemperature + ", target: "
                + targetTemperature : "Thermostat off";
    }
}
