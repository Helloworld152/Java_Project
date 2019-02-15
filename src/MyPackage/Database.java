package MyPackage;

import java.util.ArrayList;

public class Database {
    private ArrayList<CD> listCD = new ArrayList<CD>();
    private ArrayList<DVD> listDVD = new ArrayList<DVD>();

    public void add(CD cd){
        listCD.add(cd);
    }

    public void list(){
        for ( CD cd : listCD){
            cd.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("abc", "abc", 4, 60, false, "..."));
    }
}
