public class Employee {
    private String firstName;
    private String lastName;
    protected double baseSalary;

    public Employee(String firstName,String lastName,double baseSalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(baseSalary < 0){
            System.out.println("Base salary cannot be negative. Setting to 0.");
            this.baseSalary = 0;
        }else{
            this.baseSalary = baseSalary;
        }
    }
    public double getBaseSalary(){
        return baseSalary;
    }
}
