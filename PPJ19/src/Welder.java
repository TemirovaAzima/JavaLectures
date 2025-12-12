public class Welder extends Person {
    private String seniority;

    public Welder(String name,String seniority){
        super(name);
        this.seniority = seniority;
    }

    public String displayDetails(){
        return super.displayDetails() + " ,Seniority: " + seniority;
    }

}
