public class Time {
    private int hours;
    private int minutes;

    public Time(int hours,int minutes) {
        this.hours = hours;
//        if (minutes >= 60) {
//            while (minutes >= 60) {
//                minutes -= 60;
//                this.hours += 1;
//            }
//            this.minutes = minutes;
//        } else {
//            this.minutes = minutes;
//        }
        if(minutes>=60){
            hours += minutes/60;
            minutes = minutes%60;
        }
        this.hours = hours;
        this.minutes = minutes;
//    }
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }

    public void  addTime(Time t) {
//            if (minutes + t.getMinutes() >= 60) {
//                hours += t.getHours();
//                minutes += t.minutes;
//                System.out.println("current" + hours + ":" + minutes);
//            }
//        }
        hours += t.hours;
        minutes += t.minutes;
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
      System.out.println("current" + hours + ":" + minutes);

    }

     @Override
    public String toString() {
            return minutes < 10 ? hours + ":0" + minutes : hours + ":" + minutes;
         }
}

