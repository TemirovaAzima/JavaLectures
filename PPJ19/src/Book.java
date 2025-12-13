public class Book extends Publication{
    private int pageCount ;

    public Book(String title,double price,int pageCount){
        super(title,price);
        this.pageCount = pageCount;
    }

    @Override
    public String toString(){
        return "Book " + super.toString() + ". Pages: " + pageCount;
    }
}
