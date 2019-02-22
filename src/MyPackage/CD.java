package MyPackage;

public class CD extends Item {

    private String artist;
    private int numofTracks;


    public CD(String title, String artist, int numofTracks, int playingTime, String comment, boolean gotIt) {
        //
        super(title, playingTime, comment, gotIt);
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", numofTracks=" + numofTracks +
                '}';
    }

    public void print() {
        System.out.println("");
        super.print();
    }

    public static void main(String[] args) {
        CD cd = new CD("a", "b", 1, 4,"c", false);
        System.out.println(cd);
    }

}
