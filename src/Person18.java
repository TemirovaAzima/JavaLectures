public class Person18 {
    private String name;
    private int birthYear;

    public Person18(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person18(String name){
        this.name = name;
        birthYear = 2000;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return 2025 - birthYear;
    }

    public static Person18 getOlderPerson(Person18 person1, Person18 person2) {
        return person1.getAge() > person2.getAge() ? person1 : person2;
    }

    public static Person18 getOldestPerson(Person18[] people){
        Person18 oldest = people[0];
        for(int i = 0; i < people.length; i++){
        if(people[i].getAge() > oldest.getAge()){
            oldest = people[i];
          }
            oldest = getOlderPerson(people[i],oldest);
        }
        return oldest;
    }
}
