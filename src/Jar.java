public class Jar {
    private  Jam jam;
    private boolean open;
    public Jar(Jam jam){
        this.jam = jam;
        this.open = false;
    }
    public void open(){
        open = true;
    }
    public void close(){
        open = false;
    }

    public boolean isOpen(){
      return open;
    }
    @Override
    public String toString(){
        return "Jar : jam= " + jam + " , open= " + open;
    }
}

