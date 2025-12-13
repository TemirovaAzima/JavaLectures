public class AudioBook extends Publication{
    private int durationMinutes ;
    private boolean isAiNarrated;

    public AudioBook(String title,double price, int durationMinutes,boolean isAiNarrated){
        super(title,price);
        this.durationMinutes = durationMinutes;
        this.isAiNarrated = isAiNarrated;
    }

    @Override
    public String toString(){
        return "Audiobook of " + super.toString() + (isAiNarrated ? ". Narrated by Ai. " : ". Human narrated. "
                + "Duration: " +durationMinutes + " minutes.");
    }
}
