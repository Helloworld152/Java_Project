package MyPackage;

public class DVD extends Item {
    @Override
    public String toString() {
        return "DVD{}";
    }

    public DVD(String title, int playingTime, String comment, boolean gotIt) {
        super(title, playingTime, comment, gotIt);
    }
}
