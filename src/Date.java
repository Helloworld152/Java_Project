public class Date {

    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    public int getMonth(){ return month; }

    public int getDay(){return day; }

    public int getYear(){ return year; }

    public String toString(){ return getMonth() + "/" + getDay() + "/" + getYear(); }

    public static void main(String[] args) {

    }
}
