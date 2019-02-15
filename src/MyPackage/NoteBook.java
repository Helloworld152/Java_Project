package MyPackage;

import sun.awt.SunHints;

import javax.lang.model.type.ArrayType;
import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.HashSet;

class Value{
    private int i;
    public void setI(int i){
        this.i = i;
    }

    public int getI(){ return i; }

    public String toString(){ return "" + i; }
}

public class NoteBook {
    // 创建容器类
    private ArrayList<String> notes = new ArrayList<String>();


    public void add(String s){
        notes.add(s);
    }

    public int getSize(){
        return notes.size();
    }

    public String getNote(int index){
        return notes.get(index);
    }

    public void removeNote(int index){
        notes.remove(index);
    }

    public String[] list(){
        String[] a = new String[notes.size()];
//        for (int i = 0; i < notes.size(); i++) {
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
//        NoteBook nb = new NoteBook();
//        nb.add("first");
//        nb.add("second");
//        System.out.println(nb.getSize());
//        System.out.println(nb.getNote(1));
//
//        String[] a = new String[10];
//        int[] ia = new int[10];
//
//        for (int i = 0; i < ia.length; i++) {
//            ia[i] = i;
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = "" + i;
//        }
//
//        for (int k : ia) {
//            System.out.println(k);
//        }
//
//        System.out.println(a[0].length());

//        Value[] a = new Value[10];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = new Value();
//            a[i].setI(i);
//        }
//        for ( Value v : a ){
//            System.out.println(v.getI());
//            v.setI(0);
//        }
//        for ( Value v : a){
//            System.out.println(v.getI());
//        }

//        ArrayList<String> a = new ArrayList<String>();
//        a.add("first");
//        a.add("second");
//        for ( String s : a ){
//            System.out.println(s);
//        }

        // 数学中的集合，具有三个性质:无序、唯一、有限
        HashSet<String> s = new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
        for ( String k : s ){
            System.out.println(k);
        }
        // 输出容器
        System.out.println(s);
    }
}
