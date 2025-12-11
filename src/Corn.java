public class Corn {
    private int cornCount;

    public Corn(int cornCount){
        this.cornCount = cornCount;
    }

    public Popcorn[] makePopcorn(){
        int count = (int) (Math.random() * (cornCount+1));

        Popcorn[] popcorns = new Popcorn[count];

        for(int i = 0; i < popcorns.length; i++){
            popcorns[i] = new Popcorn();
        }
        return popcorns;
    }

}
