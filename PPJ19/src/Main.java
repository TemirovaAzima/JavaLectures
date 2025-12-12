public class Main {
    public static void main(String[] arg){
        // 1
        Person person = new Person("Kim");
        Welder welder = new Welder("Emilly","middle");
        System.out.println(person.displayDetails());
        System.out.println(welder.displayDetails());
        // 2
         Employee employee = new Employee("Jennifer" , "Lue",3000);
         Manager manager = new Manager("Tiffany", "Leo",5000,0.2);
         System.out.println(manager.getBaseSalary());
         System.out.println(manager.totalSalary());
         // 3


    }
}
