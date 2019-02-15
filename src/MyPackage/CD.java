package MyPackage;

public class CD {
    private String title;
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public CD(String title, String artist, int numofTracks, int playingTime, boolean gotIt, String comment) {
        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }

    public void print() {
        System.out.println(title + "");
    }

    public static void main(String[] args) {

    }


}
