public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(0,25);
        thermostat.turnOn();
        System.out.println(thermostat.isOn());
        thermostat.setTargetTemperature(90);
        System.out.println(thermostat.status());
        thermostat.turnOff();
        System.out.println(thermostat.status());
        // 2
        BankAccount bankAccount = new BankAccount("skkk46666");
        bankAccount.deposit(200);
        bankAccount.withdraw(300);
        bankAccount.showBalance();
        BankAccount bankAccount1 = new BankAccount("8888pp",-200);
        bankAccount1.withdraw(100);
        bankAccount1.deposit(-600);
        bankAccount1.showBalance();

}