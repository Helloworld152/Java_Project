package MyPackage;

public class Item {

    private String title;
    private int playingTime;
    private String comment;
    private boolean gotIt = false;

    public Item(String title, int playingTime, String comment, boolean gotIt) {
        super();
        this.title = title;
        this.playingTime = playingTime;
        this.comment = comment;
        this.gotIt = gotIt;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void print(){
    }
}
