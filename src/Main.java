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
        // 3
    Person18 emily = new Person18("Emily");
    Person18 evelyn = new Person18("Evelyn",1999);
    System.out.println("Older: " + Person18.getOlderPerson(emily,evelyn).getName());
//    Person18[] people = {emily,evelyn,new Person18("azima")};
    Person18[] people = {new Person18("Erica",1904),emily,evelyn};
    System.out.println("Oldest: " + Person18.getOldestPerson(people).getName());
    // or u can do this way too
    System.out.println("Oldest:" +Person18.getOldestPerson(new Person18[] {emily,evelyn,new Person18("Kim")}).getName());
    // 4
    Jam strawberry = new Jam("Strawberry",0.5);
    Jam peach = new Jam("Peach");
    Jam unknown = new Jam(0.2);

    System.out.println(strawberry);
    System.out.println(peach);
    System.out.println(unknown);
    // 5
    Jar strawberryJar = new Jar(strawberry);
    Jar peachJar = new Jar(peach);
    Jar unknownJar = new Jar(unknown);
    strawberryJar.open();
    peachJar.close();
    unknownJar.close();
    System.out.println(unknownJar.isOpen());
    System.out.println(strawberryJar);
    System.out.println(peachJar);
    System.out.println(unknownJar);
    // 6
    Corn pack = new Corn(7);
    Popcorn[] popcorns = pack.makePopcorn();
//    for(Popcorn popcorn1 : corn.makePopcorn()){
//        System.out.println(popcorn1);
//    }
    System.out.println("Number of popcorns: " + popcorns.length);
    System.out.println(Arrays.toString(popcorns));
   // 7
    Time time = new Time(1,115);
    Time time2 = new Time(1,115);
    System.out.println(time.getHours());
    System.out.println(time.getMinutes());

    System.out.println(time);
    System.out.println(time2);
    System.out.println();
    time.addTime(time2);

    }