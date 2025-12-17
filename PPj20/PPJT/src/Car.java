public class Car {
    private String model;
    private String color;
    int power = 10;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void increasePower() {
        if (power + 50 <= 1000) {
            this.power += 50;
        }
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.power;
    }
}
    class SportCar extends Car{
        int raceRating;
        public SportCar(String model,String color,int raceRating){
            super(model,color);
            this.raceRating = raceRating;
        }


        @Override
        public String toString(){
            return super.toString() + " " + this.raceRating;
        }

        @Override
        public void increasePower(){
            if(power+50 <= 1000 && raceRating !=0){
                this.power+=50;
            }
        }

    }

