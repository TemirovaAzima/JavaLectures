public class VerySimple {
    private String name;
    private int age;

    // constructor
    public VerySimple(int age, String n){
        this.age = age;
        name = n;
    }
    // getter
    public int getAge(){
        return age;
    }
    // setter
    void setAge(int a){
        age = a;
    }
    // getter (with no corresponding setter)
    public String getName(){
        return name;
    }

}
