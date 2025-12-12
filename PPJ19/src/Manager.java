public class Manager extends Employee{
    private double managementBonus ;

    public Manager(String firstN,String lastN,double baseS,double managementB){
        super(firstN,lastN,baseS);
        if(managementB < 0){
            System.out.println("bonus can't be negative,set to 0");
            managementBonus = 0;
        }else{
            managementBonus = managementB;
        }
    }

    public double totalSalary(){
        return baseSalary *(1 + managementBonus);
//        return getBaseSalary() * (1 + managementBonus);
    }
}