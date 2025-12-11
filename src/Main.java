public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(0,25);
        thermostat.turnOn();
        System.out.println(thermostat.isOn());
        thermostat.setTargetTemperature(90);
        System.out.println(thermostat.status());
        thermostat.turnOff();
        System.out.println(thermostat.status());


}